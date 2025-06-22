package OOP.nested_classes;

public class Human {

    // Human Start 👇
    private Passport passport;
    private Heart heart;

    // Constructor
    public Human(String series, String number, PassportType passportType,
                 double weight) {
        this.passport = new Passport(series, number, passportType);
        this.heart = new Heart(weight);
    }

    // ToString
    @Override
    public String toString() {
        return "Human{" +
                "passport=" + passport +
                ", heart=" + heart +
                '}';
    }
    // Human End 👆

    // Heart
    public class Heart {
        private double weight;

        // Constructor
        public Heart(double weight) {
            this.weight = weight;
        }

        // ToString
        @Override
        public String toString() {
            return "Heart{" +
                    "weight=" + weight +
                    '}';
        }
    }

    // Passport Start 👇
    public static class Passport {
        private String series;
        private String number;
        private PassportType passportType;

        // Constructor
        public Passport(String series, String number, PassportType passportType) {
            this.series = series;
            this.number = number;
            this.passportType = passportType;
        }

        // Passport setters start 👇
        public void setSeries(String series) {
            this.series = series;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public void setPassportType(PassportType passportType) {
            this.passportType = passportType;
        }
        // Passport setters end 👆

        // ToString
        @Override
        public String toString() {
            return "Passport{" +
                    "series='" + series + '\'' +
                    ", number='" + number + '\'' +
                    ", passportType='" + passportType + '\'' +
                    '}';
        }
    }
    // Passport End 👆
}