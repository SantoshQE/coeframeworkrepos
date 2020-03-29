package enums;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DriverTypeTests {

    @Test
    public void validPropertyShouldReturnCorrectDriverType()
    {
        for(DriverType type : DriverType.values())
        {
            assertEquals("error Message",type, DriverType.fromString(type.asString()));
        }
    }
    @Test
    public void invalidPropertyShouldThrowException()
    {
        String test= "foobar";
        try{
            DriverType.fromString(test);
        }catch(IllegalArgumentException expected)
        {
            assertEquals("value "+test+ " is not a valid enum value", expected.getMessage());
        }
    }
    @Test
    public void driverTypeToStringShouldBeFormattedCorrectly()
    {
        DriverType driverType = DriverType.CHROME;
        assertEquals("DriverType{type='chrome'}", driverType.toString());
    }
}
