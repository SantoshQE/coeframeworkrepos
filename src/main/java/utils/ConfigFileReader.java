package utils;

import com.google.common.annotations.VisibleForTesting;
import enums.DriverType;
import enums.EnvironmentType;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public final class ConfigFileReader
{
    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigFileReader.class);
    private static final String PROPERTY_FILE_PATH = "/config.properties";

    @VisibleForTesting
    static final Properties properties =  new Properties();

    public ConfigFileReader()
    {
        readProperties(PROPERTY_FILE_PATH);
    }
    public ConfigFileReader(final String propertyFilePath)
    {
        readProperties(propertyFilePath);
    }
   public void readProperties(final String propertyFilePath)
   {
       //String rootPath  = System.getProperty("user.dir");

       try(InputStream inputStream = ConfigFileReader.class.getResourceAsStream(propertyFilePath))
       {
           if(inputStream==null)
           {
               throw new FileNotFoundException("cannot find resource 'config.properties'");
           }
           properties.load(inputStream);
           LOGGER.info("Finished Loading properties from {}",propertyFilePath);
           LOGGER.info(toString());
       } catch (IOException e) {
           LOGGER.error("Problem while loading properties from resource" , e);
       }
   }

    public String getProperty(String propertyName)
    {
        Object value = properties.get(propertyName);
        if(value == null)
        {
            return null;
        }
        return  value.toString();
    }
    public long getImplicitlyWait()
    {
        String implicitlyWait = properties.getProperty("implicitlyWait");
        return Long.parseLong(implicitlyWait);
    }
    public String getDriverPath()
    {
        return properties.getProperty("driverPath");
    }
    public DriverType getBrowser()
    {
        String browserName = properties.getProperty("browser");
        return DriverType.fromString(browserName);
    }
    public EnvironmentType getEnvironment()
    {
        String environmentName = properties.getProperty("environment");
        return EnvironmentType.fromString(environmentName);
    }
    public Boolean  getBrowserWindowSize()
    {
        String windowSize = properties.getProperty("windowMaximize");
        if(windowSize != null)
        {
            return Boolean.valueOf(windowSize);
        }
        return true;
    }
    public String getPlatform()
    {
        return properties.getProperty("remoteDriverPlatform");
    }
    public String getBrowserVersion()
    {
        return properties.getProperty("remoteDriverBrowserVersion");
    }
    public String getRemoteUrl()
    {
        return properties.getProperty("remoteDriverUrl");
    }
    @Override
    public String toString()
    {
        StringBuilder builder =  new StringBuilder("\n");
        Enumeration<?> enumerationProperties = properties.propertyNames();
        while(enumerationProperties.hasMoreElements())
        {
            String key = (String) enumerationProperties.nextElement();
            builder.append(key).append(" ==> ").append(properties.getProperty(key));
            builder.append("\n");
        }
        return builder.toString();
    }


    public String getUrlGoogleHomePage()
    {
        return properties.getProperty("urlGoogleHomePage");
    }

}
