package managers;

import enums.DriverType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import utils.ConfigFileReader;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class LocalDriverBuilder
{
    private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
    private static final String EXCEPTION_MESSAGE = "value of %s is not a supported enumeration";

    public LocalDriverBuilder()
    {
        System.out.println(" inside LocalDriverBuilder constructor...");
        //this.driverType = DriverType;
    }
    public WebDriver createLocalDriver(DriverType driverType) {
//        System.out.println(" inside createLocalDriver method...");
        WebDriver driver = selectDriver(driverType);
        return configureDriver(driver);
    }

    WebDriver configureDriver( WebDriver driver) {
        Boolean windowMaximize = (getConfiguration().getBrowserWindowSize());
        if(Boolean.TRUE.equals(windowMaximize))
        {
            driver.manage().window().maximize();
        }
        driver.manage().timeouts().implicitlyWait(Objects.requireNonNull(getConfiguration().getImplicitlyWait()), TimeUnit.SECONDS);
        return driver;
    }

    WebDriver selectDriver(DriverType driverType)
    {
        WebDriver driver;
        switch (driverType)
        {
            case CHROME:
                driver = getChromeDriver();
                break;
            case FIREFOX:
                driver = getFireFoxDriver();
                break;
            case INTERNETEXPLORER:
                driver = getIEDriver();
                break;
            case HEADLESS:
                driver = getHeadlessChromeDriver();
                break;
            default:
                throw new UnsupportedOperationException(String.format(EXCEPTION_MESSAGE, driverType));
        }
        return driver;
    }

    //To do implement IE driver
    WebDriver getIEDriver()
    {
        WebDriver driver;
        driver = new InternetExplorerDriver();
        return driver;
    }
    //To do implement gecko driver
    WebDriver getFireFoxDriver()
    {
        WebDriver driver;
        driver = new FirefoxDriver();
        return driver;
    }
    WebDriver getChromeDriver()
    {
        WebDriver driver;
        System.setProperty(CHROME_DRIVER_PROPERTY, getConfiguration().getDriverPath());
        String folder = "user-data-dir="+System.getenv("APPDATA")+"\\Chrome\\Datadir";
        ChromeOptions options = new ChromeOptions();
        options.addArguments(folder);
/*         options.addArguments("--no-sandbox");
         options.addArguments("--disable-dev-shm-usage");*/
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        return driver;
    }

    WebDriver getHeadlessChromeDriver()
    {
        WebDriver driver;
        System.setProperty(CHROME_DRIVER_PROPERTY, getConfiguration().getDriverPath());
        // String folder = "user-data-dir="+System.getenv("APPDATA")+"\\Chrome\\Datadir";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        return driver;
    }



    ConfigFileReader getConfiguration()
    {
        return  new ConfigFileReader();
    }
}
