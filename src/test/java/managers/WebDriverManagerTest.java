package managers;

import enums.DriverType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import utils.ConfigFileReader;

@RunWith(MockitoJUnitRunner.class)
public class WebDriverManagerTest {

    private WebDriverManager underTest;

    @Mock
    private RemoteDriverBuilder remoteDriverBuilder;

    @Mock
    private LocalDriverBuilder localDriverBuilder;

    @Test
    public void shouldCreateRemoteDriverWhenEnvironmentTypeRemoteDriverTypeChrome1() {
        final String propertyFilePath = "/testData/config-test-remote.properties";
        underTest = new WebDriverManager(){
            @Override
            ConfigFileReader getConfiguration(){
                return new ConfigFileReader(propertyFilePath);
            }
        };
        underTest.getDriver();
        // Mockito.verify(remoteDriverBuilder,Mockito.atLeastOnce()).createRemoteDriver(DriverType.CHROME);
        Mockito.verify(localDriverBuilder, Mockito.atLeastOnce()).createLocalDriver(DriverType.CHROME);
    }


  /*  @Test
    public void shouldCreateRemoteDriverWhenEnvironmentTypeRemoteDriverTypeChrome() {
        final String propertyFilePath = "/testData/config-test-remote.properties";
        underTest = new WebDriverManager(remoteDriverBuilder,localDriverBuilder){
            @Override
            ConfigFileReader getConfiguration(){
                return new ConfigFileReader(propertyFilePath);
            }
        };
        underTest.getDriver();

        // Mockito.verify(remoteDriverBuilder,Mockito.atLeastOnce()).createRemoteDriver(DriverType.CHROME);
        Mockito.verify(localDriverBuilder, Mockito.atLeastOnce()).createLocalDriver(DriverType.CHROME);
    }*/
}
