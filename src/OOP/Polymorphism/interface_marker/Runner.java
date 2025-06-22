package OOP.Polymorphism.interface_marker;

public class Runner {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Airplane airplane = new Airplane();

        // Bird 👇
        if (bird instanceof Alive){
            System.out.println("This object is alive");
            bird.breath();
        }
        else {
            System.out.println("This object is not alive");
        }


        // Airplane 👇
        if (airplane instanceof Alive){
            System.out.println("This object is alive");
        }
        else {
            System.out.println("This object is not alive");
        }
    }
}
