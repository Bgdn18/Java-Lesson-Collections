package OOP.Polymorphism.interfaces.task;

public class Runner {
    public static void main(String[] args) {
        Swimable[] swimable = {new Fish(), new Duck()};
        Flying[] flying = {new Duck(), new Airplane()};

        // Those who can swim to the pool 👇👇👇
        for (Swimable pool : swimable){
            pool.swim();
        }

        // And flying into the sky 👇👇👇
        for (Flying air : flying){
            air.fly();
        }
    }
}
