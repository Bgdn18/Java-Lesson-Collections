package StartJava.While;

public class WhileTrue {
    public static void main(String[] args) {
        int count = 0;

        while (true) // The endless loop
        {
            count++; // Adds one to the "count"
            System.out.println(count); // Outputs count

            if (count == 1_812_222) // But, if the count is equal to "1_812_222", then we perform the action in parentheses
            {
                break; // Interrupts the cycle (both infinite and normal)
            }
        }

    }
}
