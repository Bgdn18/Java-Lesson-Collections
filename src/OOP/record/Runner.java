package OOP.record;

public class Runner {
    public static void main(String[] args) {

        System.out.println("___Human___");
        Human human = new Human(1991, "Ivan", "Ivanovich",
                "Ivanov");
        System.out.println(human);
        human.getInfo();

        System.out.println("___Human Record___");
        HumanRecord humanRecord = new HumanRecord(1991, "Ivan", "Ivanovich",
                "Ivanov");
        System.out.println(humanRecord);
        humanRecord.getInfo();
    }
}
