package randomnumber;

import java.lang.Math;
import java.util.Random;

public class Random_Number_Generator {
    public static void main(String[]args){
        int min = 100;
        int max = 400;
        int a = (int)(Math.random()*(max-min)+min);

        Random number = new Random();
        System.out.println(a);
        System.out.println(number.nextBoolean());
        
    }
}
