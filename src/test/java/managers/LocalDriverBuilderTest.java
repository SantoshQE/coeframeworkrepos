package managers;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import enums.DriverType;

import static org.junit.Assert.assertEquals;

public class LocalDriverBuilderTest
{
    private LocalDriverBuilder underTest;
    private String result;

    @Test
    public void methodGetChromeDriverShouldCeCalledWhenDriverTypeEqualsChrome()
    {
        underTest = new LocalDriverBuilder() {
            @Override
            WebDriver getChromeDriver() {
                result = "chrome";
                return null;
            }
        };
        underTest.selectDriver(DriverType.CHROME);
        assertEquals("chrome",result);
    }
    @Test
    public void methodGetFireFoxDriverShouldCeCalledWhenDriverTypeEqualsFireFox()
    {
        underTest = new LocalDriverBuilder() {
            @Override
            WebDriver getFireFoxDriver() {
                result = "firefox";
                return null;
            }
        };
        underTest.selectDriver(DriverType.FIREFOX);
        assertEquals("firefox",result);
    }
    @Test
    public void methodGetIEDriverShouldCeCalledWhenDriverTypeEqualsInternetExplorer()
    {
        underTest = new LocalDriverBuilder() {
            @Override
            WebDriver getIEDriver() {
                result = "IE";
                return null;
            }
        };
        underTest.selectDriver(DriverType.INTERNETEXPLORER);
        assertEquals("IE",result);
    }
    @Test
    public void methodGetHeadlessChromeDriverShouldCeCalledWhenDriverTypeEqualsHeadless()
    {
        underTest = new LocalDriverBuilder() {
            @Override
            WebDriver getHeadlessChromeDriver() {
                result = "headless";
                return null;
            }
        };
        underTest.selectDriver(DriverType.HEADLESS);
        assertEquals("headless",result);
    }
}
