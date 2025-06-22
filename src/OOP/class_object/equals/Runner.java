package OOP.class_object.equals;

public class Runner {
    public static void main(String[] args) {
        Child child1 = new Child("Lesha", 2018);
        Child child2 = new Child("Petya", 2019);
        Child child3 = new Child("Ivan", 2019);

        Child[] children = {child1, child2, child3};
        Kindergarten kindergarten = new Kindergarten(children); // Children garden

        boolean searchResult = false; // Default: false
        Child childForSearch = new Child("Petya", 2019); // 👈👈 Search

        for (Child child : kindergarten.getChildren()) {
            if (child.equals(childForSearch)) {
                searchResult = true;
                break;
            }
        }
        System.out.println(searchResult); // output search result
    }
}
