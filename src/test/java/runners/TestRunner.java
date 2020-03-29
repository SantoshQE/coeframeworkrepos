package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src\\test\\resources\\functionalTests",
        glue="stepdefinitions",
        strict = true,
        plugin = { "pretty", "junit:target/cucumber-reports/Cucumber_Results.xml","json:target/cucumber-reports/Cucumber.json",
                "html:target/cucumber-reports","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true
)
public class TestRunner
{
    @BeforeClass
    public static void setup()
    {
        System.out.println("Ran the before");
    }

    @AfterClass
    public static void teardown()  {
        System.out.println("Ran the after");
        //TestUtil.convertJSONToXML();
    }
}
