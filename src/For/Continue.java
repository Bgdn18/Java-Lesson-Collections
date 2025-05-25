package For;

public class Continue {
    public static void main(String[] args)
    {
        int[] Weekday = {1,2,3,4,5,6,7}; // Days of the week, from Monday to Sunday
        for (int result : Weekday) // We go through the days of the week and record them in the "result"
        {
            if (result == 6 || result == 7) // If the day of the week is 6 or 7, then we have a day off.
            {
                System.out.println(result + ": Weekend"); // We deduce that we have a day off today.
            }
            else // Otherwise, we have a working day.
            {
                System.out.println(result + ": We are working"); // We are working on this day
            }
        }
    }
}
