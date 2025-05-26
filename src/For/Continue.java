package For;

public class Continue {
    public static void main(String[] args)
    {
        /*
        We need to make it so that if the dice rolls the number "6" then the athlete will do push-ups,
        if the number is not "6" then the athlete will do push-ups
         */

        int[] results = {3,4,1,6,3,5}; // Random numbers that fall out
        for (int result : results) // Let's go through the numbers that have fallen out
        {
            System.out.println(result + ":"); // Let's output the number
            if (result == 6) // If we get the number "6" then we skip the iteration
            {
                continue; // Skip the loop iteration
            }
            System.out.println("The athlete does push-ups\n"); // If the number is not equal to "6" then we write that the athlete is doing push-ups
        }
    }
}
