package While;

public class DoWhile {
    public static void main(String[] args) {
        int count = 0; // count

        // Below is the "do while" construction
        do // This action will be performed EVEN if while is already false on the first iteration.
        {
            count++; // Adds one to the "count"
            System.out.println(count); // Outputs count
        }
        while (count < 0); // FALSE, but if there were a number "100" here, for example, then we would have a cycle going up to one hundred

        // Below is the usual cycle
        while (count < 0) // While a regular loop without "do" wouldn't even work
        {
            System.out.println(count); // Will not display
        }
    }
}
