package stepdefinitions;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pageobjects.GoogleHomePage;

public class Steps
{
   WebDriver driver;
   PageObjectManager pageObjectManager;
   WebDriverManager webDriverManager;
   GoogleHomePage GoogleHomePage;

    public Steps()
    {
        webDriverManager = new WebDriverManager();
        driver = webDriverManager.getDriver();
        pageObjectManager = new PageObjectManager(driver);
        GoogleHomePage =  pageObjectManager.getGoogleHomePage();
    }
    @After
    public void tearDown()
    {
        webDriverManager.closeDriver();
    }
/*    @Before
    public void initializeDriver()
    {
        this.driver =  webDriverManager.getDriver();
    }*/
    @Given("user is on the google homepage")
    public void userIsOnTheGoogleHomepage()
    {
        GoogleHomePage.navigateToGoogleHomePage();
    }

    @When("the user enters the search text {string}")
    public void googlesearchtextentery(String searchString)
    {
        GoogleHomePage.enterSearchTestinGoogleSearchTxt(searchString);
    }

    @Then("click on search and verify the search results retrieved by google")
    public void clickOnSearchbuttonandVerify()
    {
        GoogleHomePage.searchGoogle();
    }

    @AfterStep
    public void tearDown(Scenario scenario)
    {
            if (!scenario.isFailed() && driver != null && driver.getWindowHandles() != null )
            {
                // Take a screenshot...
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                // embed it in the report.
                scenario.write("Inside teardown method-->Test Passed");
                scenario.embed(screenshot,"image/png","Test");
            }
            if (scenario.isFailed() && driver != null && driver.getWindowHandles() != null)
            {
                // Take a screenshot...
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                // embed it in the report.
                scenario.write("Inside teardown method -->Test Failed");
                scenario.embed(screenshot,"image/png","Test");
            }
    }

    @And("closes the browser window")
    public void closesTheBrowserWindow()
    {
        driver.close();
    }

}
