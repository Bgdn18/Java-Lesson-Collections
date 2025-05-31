package String;

public class StringFormatPractice {
    public static void main(String[] args) {
        String carMark = "Audi";
        String carModel = "Q3";
        double price = 15_000.00;
        boolean hasAutomaticTransmission = true;

        /*
        Task: use String Format to compose a string:
        Hello, I am the manager of [Brand Name] salon
        We have a model - [Model Name] for [Price]
        Does it have an automatic transmission?
        [Yes/No].
        */

        String result =
                """
                Hi, I'm the manager of %s.
                We have a %s model for %f
                -Does it have an automatic transmission?
                %s
                """.formatted(carMark, carModel, price, hasAutomaticTransmission ? "Yes" : "No");
        System.out.println(result);
    }
}
