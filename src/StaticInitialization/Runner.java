package StaticInitialization;

public class Runner {
    public static void main(String[] args) {
        StaticInitialization staticInitialization = new StaticInitialization("Kia");
        System.out.println(staticInitialization.BRAND);
        staticInitialization.BRAND = "BMW";
        System.out.println(staticInitialization.BRAND);
    }
}
