package utils;

import org.junit.Test;

import static org.junit.Assert.*;
import static utils.ConfigFileReader.properties;

public class ConfigFileReaderTests
{

    @Test
    public void getConfigurationShouldGetAllProperties()
    {
     properties.clear();

     final String propertyFilePath = "/testData/config-test.properties";
     ConfigFileReader underTest = new ConfigFileReader(propertyFilePath);

     assertEquals("local",underTest.getEnvironment().asString());
     assertEquals("chrome",underTest.getBrowser().asString());
     assertEquals(666,underTest.getImplicitlyWait());
     assertEquals("urlGoogleHomePage",underTest.getUrlGoogleHomePage());
     assertEquals("pathToDriver",underTest.getDriverPath());
     assertFalse(underTest.getBrowserWindowSize());
     assertEquals("randomValue",underTest.getProperty("randomProperty"));
     assertEquals("",underTest.getProperty("randomNullValueProperty"));
     assertEquals("platform A9",underTest.getPlatform());
     assertEquals("version0.1",underTest.getBrowserVersion());
     assertEquals("http://www.somesite.com",underTest.getRemoteUrl());
    }

    @Test
    public void getBrowserWindowSizeShouldReturnTrueWhenValueTrue()
    {
        properties.clear();
        final String propertyFilePath = "/testData/config-test-window-size-true.properties";
        ConfigFileReader underTest = new ConfigFileReader(propertyFilePath);
        assertTrue(underTest.getBrowserWindowSize());
    }

    @Test
    public void getBrowserWindowSizeShouldReturnTrueWhenValueNull()
    {
        properties.clear();
        final String propertyFilePath = "/testData/config-test-window-size-null.properties";
        ConfigFileReader underTest = new ConfigFileReader(propertyFilePath);
        assertTrue(underTest.getBrowserWindowSize());
    }

    @Test
    public void getConfigurationWithDefaultConstructorShouldGetConfigProperties()
    {
        properties.clear();
        ConfigFileReader underTest = new ConfigFileReader();
        //assertEquals("https://username:password@www.remoteurl.com:443/wd/hub",underTest.getRemoteUrl());
        assertEquals("https://username:password@www.remoteurl.com:443/wd/hub",underTest.getRemoteUrl());
    }

    @Test
    public void getPropertyWithNullValueShouldReturnNull()
    {
        properties.clear();
        final String propertyFilePath = "/testData/config-test-window-size-null.properties";
        ConfigFileReader underTest = new ConfigFileReader(propertyFilePath);
        assertNull(underTest.getProperty("Null"));
    }


}
