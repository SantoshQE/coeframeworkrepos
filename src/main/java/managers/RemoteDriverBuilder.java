package managers;

import enums.DriverType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import utils.ConfigFileReader;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class RemoteDriverBuilder
{
    private static final String PROXY = "abc.proxy.com";
    private final String remoteDriverUrl = getConfiguration().getRemoteUrl();

    public WebDriver createRemoteDriver(DriverType driverType) {
        DesiredCapabilities remoteCaps = new DesiredCapabilities();
        System.getProperties().put("http.proxyHost", PROXY);
        System.getProperties().put("http.proxyPort", "8080");
        System.getProperties().put("https.proxyHost", PROXY);
        System.getProperties().put("https.proxyPort", "8080");

        remoteCaps.setCapability(CapabilityType.BROWSER_NAME, driverType.asString());
        remoteCaps.setCapability("platform", getConfiguration().getPlatform());
        remoteCaps.setCapability("version", getConfiguration().getBrowserVersion());
        //global capabilities for enterpise specific
        remoteCaps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        remoteCaps.setCapability("parentTunnel", "COMANYNAME_ADMIN");
        remoteCaps.setCapability("tunnelIdentifier", "ipsec-companyname");
        remoteCaps.setCapability("extendedDebugging", true);

        WebDriver driver;
        try {
            driver = new RemoteWebDriver(new URL(remoteDriverUrl), remoteCaps);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
        Boolean windowMaximize = (getConfiguration().getBrowserWindowSize());
        if (Boolean.TRUE.equals(windowMaximize)) {
            driver.manage().window().maximize();
        }
        driver.manage().timeouts().implicitlyWait(Objects.requireNonNull(getConfiguration().getImplicitlyWait()), TimeUnit.SECONDS);
        return driver;

    }
    ConfigFileReader getConfiguration()
     {
         return new ConfigFileReader();
     }


}
