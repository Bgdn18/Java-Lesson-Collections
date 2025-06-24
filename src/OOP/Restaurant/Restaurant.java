package OOP.Restaurant;

public class Restaurant {
    private static int sausageCount;
    private static int breadCount;

    public void cookHotDog() {
        System.out.println("Cooking a hot dog...");

        if (hasEnoughIngredients()) {
            useIngredients();
            System.out.println("Hot dog is ready!");
        } else {
            System.out.printf("Not enough ingredients: %d sausage(s), %d bread slice(s)%n",
                    sausageCount, breadCount);
        }
    }

    private boolean hasEnoughIngredients() {
        return sausageCount >= 1 && breadCount >= 2;
    }

    private void useIngredients() {
        sausageCount--;
        breadCount -= 2;
    }

    public void addIngredients(int sausageToAdd, int breadToAdd) {
        if (sausageToAdd < 0 || breadToAdd < 0) {
            System.out.println("Error: Cannot add negative quantities");
            return;
        }

        sausageCount += sausageToAdd;
        breadCount += breadToAdd;
        System.out.printf("Added successfully: %d sausage(s), %d bread slice(s)\n",
                sausageToAdd, breadToAdd);
    }

    // Getters
    public static int getSausageCount() {
        return sausageCount;
    }

    public static int getBreadCount() {
        return breadCount;
    }
}