package enums;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnvironmentTypeTests
{
    @Test
    public void validPropertyShouldReturnCorrectEnvionmentType()
    {
        for(EnvironmentType type : EnvironmentType.values())
        {
            assertEquals("error Message",type, EnvironmentType.fromString(type.asString()));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidPropertyShouldThrowException()
    {
        EnvironmentType.fromString("foobar");
    }
    @Test
    public void environmntTypeToStringShouldBeFormattedCorrectly()
    {
        EnvironmentType environmentType = EnvironmentType.REMOTE;
        assertEquals("DriverType{type='remote'}", environmentType.toString());
    }

}
