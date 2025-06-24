package OOP.StaticInitialization;

import java.util.Arrays;

public class StaticInitialization {
    public String BRAND;

    // Constants
    private static final String BMW_INFO = "German luxury automaker...";
    private static final String KIA_INFO = "South Korean manufacturer...";
    private static final String AUDI_INFO = "German premium brand...";

    private final static String[] BRAND_INFO = new String[3];

    static {
        BRAND_INFO[0] = BMW_INFO;
        BRAND_INFO[1] = KIA_INFO;
        BRAND_INFO[2] = AUDI_INFO;
        System.out.println(Arrays.toString(BRAND_INFO));
    }

    public StaticInitialization(String brand)
    {
        BRAND = brand;
    }
}