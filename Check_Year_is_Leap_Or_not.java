package Online_coding_problems;

import java.util.Scanner;

public class Check_Year_is_Leap_Or_not {
    public static void main(String[] args) {
         Scanner abc = new Scanner(System.in);

        int year = abc.nextInt();
        abc.close();
        boolean leap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}
