package Restaurant;

public class Runner {

// Create a network of restaurants that has a common, for all restaurants, stock of food: sausages, bread.
// Each restaurant can serve a dish: then minus 1 sausage and two pieces of bread from the common stock.
// If there are not enough sausages or bread, then display: no ingredients!
// Each restaurant can accept a batch of goods: plus 100 sausages and 200 pieces of bread.
// The stock of products must be hidden from other people's eyes!

    public static void main(String[] args) {
        // Initialization
        Restaurant restaurant1 = new Restaurant();
        Restaurant restaurant2 = new Restaurant();

        // Cook
        System.out.println("________restaurant2 cook_______");
        restaurant2.cookHotDog();

        // We add products from the first restaurant and the second restaurant
        System.out.println("\n________addIngredients_______");
        restaurant1.addIngredients(12,16);

        System.out.println("\n________addIngredients with negative_______");
        restaurant1.addIngredients(-12,-16);

        // Cook
        System.out.println("\n________again restaurant2 cook_______");
        restaurant2.cookHotDog();

        // get
        System.out.println("\n________get_______");
        System.out.println("Sausage: " + Restaurant.getSausageCount());
        System.out.println("Bread: " + Restaurant.getBreadCount());
    }
}
