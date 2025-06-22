package OOP.class_object.basic;

public class Cat {
    private String catName;

    public Cat(String catName) {
        this.catName = catName;
    }

    @Override
    public String toString() {
        return catName;
    }
}
