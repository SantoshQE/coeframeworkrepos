package enums;

public enum EnvironmentType
{
    LOCAL("local"),
    REMOTE("remote");

    private String type;

    EnvironmentType(final String type)
    {
        this.type = type;
    }
    public static EnvironmentType fromString(final String fromValue)
    {
        for(EnvironmentType type:EnvironmentType.values())
        {
            if(type.name().equalsIgnoreCase(fromValue))
            {
                return  type;
            }
        }
        throw new IllegalArgumentException("value " + fromValue + " is not a valid enum value");
    }
    public String asString()
    {
        return  type;
    }
    @Override
    public String toString()
    {
        return "DriverType{" +
                "type='" + type + '\'' +
                '}';
    }
}
