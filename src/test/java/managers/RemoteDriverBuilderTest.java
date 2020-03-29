package managers;

import enums.DriverType;
import org.junit.Test;
import utils.ConfigFileReader;

public class RemoteDriverBuilderTest
{
    private RemoteDriverBuilder  testBuilder;

    @Test(expected = IllegalArgumentException.class)
    public void MalformedUrlExceptionShouldBeCaught()
    {
      final String propertyFilePath ="/testData/config-test-remote-malformed-url.properties";
      testBuilder= new RemoteDriverBuilder() {
              @Override
              ConfigFileReader getConfiguration()
                {
                  return new ConfigFileReader(propertyFilePath);
              }
          };
      testBuilder.createRemoteDriver(DriverType.CHROME);
    }
}
