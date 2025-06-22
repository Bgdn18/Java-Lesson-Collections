package OOP.enumeration;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        //Task:
        //Create a directory of countries that can be used in any class
        //Japan: population 140 million, language Japanese
        //Greece: population 10 million, language Greek
        //Argentina: population 47 million, language Spanish


        System.out.println(Arrays.toString(Country.values()));

        try {
            System.out.println(Country.valueOf("GREECE").getLanguage());
        }
        catch (Exception ex) {
            System.out.println("Error { " + ex + " } ");
        }
    }
}
