package managers;

import enums.DriverType;
import enums.EnvironmentType;
import org.openqa.selenium.WebDriver;
import utils.ConfigFileReader;

public class WebDriverManager
{
    private static final String EXCEPTION_MESSAGE = "value of %s is not a supported enumeration";

    private WebDriver driver;
    private DriverType driverType;
    private EnvironmentType environmentType;

    private RemoteDriverBuilder remoteDriverBuilder;
    private LocalDriverBuilder localDriverBuilder;


    @SuppressWarnings("squid:S1699")
    public WebDriverManager()
    {
        driverType = getConfiguration().getBrowser();
        environmentType = getConfiguration().getEnvironment();
        remoteDriverBuilder = new RemoteDriverBuilder();
        localDriverBuilder = new LocalDriverBuilder();
    }

    @SuppressWarnings("squid:S1699")
    WebDriverManager(RemoteDriverBuilder remoteDriverBuilder, LocalDriverBuilder localDriverBuilder)
    {
        driverType = getConfiguration().getBrowser();
        environmentType = getConfiguration().getEnvironment();
        this.remoteDriverBuilder =  remoteDriverBuilder;
        this.localDriverBuilder =  localDriverBuilder;
    }
    ConfigFileReader getConfiguration()
    {
        return new ConfigFileReader();
    }

    public WebDriver getDriver()
    {
        if(driver == null) {
            driver = createDriver();
        }
        return driver;
    }

    private WebDriver createDriver() {
        switch (environmentType) {
            case LOCAL:
                driver = localDriverBuilder.createLocalDriver(driverType);
                break;
            case REMOTE:
                driver = remoteDriverBuilder.createRemoteDriver(driverType);
                break;
            default:
               throw new UnsupportedOperationException(String.format(EXCEPTION_MESSAGE,environmentType));
        }
        return driver;
    }

    public void closeDriver()
    {
        //driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }
}
