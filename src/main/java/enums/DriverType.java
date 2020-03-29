package enums;

public enum DriverType
{
    CHROME("chrome"),
    FIREFOX("firefox"),
    INTERNETEXPLORER("internetexplorer"),
    HEADLESS("headless");

    private String type;

    DriverType(final String type)
    {
        this.type = type;
    }

    public static DriverType fromString(final String fromvalue)
    {
        for(DriverType type: DriverType.values())
        {
            if(type.name().equalsIgnoreCase(fromvalue))
            {
                return type;
            }
        }
        throw new IllegalArgumentException("value "+fromvalue + " is not a valid enum value");
    }
    public String asString()
    {
        return type;
    }
    @Override
    public String toString()
    {
        return "DriverType{" + "type='"+ type + '\''+'}';
    }
}
