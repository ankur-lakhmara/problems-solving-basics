package sample;
import java.util.Scanner;
public class Main
{
    public static void main(String[]arg){
        System.out.println("Enter any number to get factorial");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double n = 1;
        int i;
        for(i = a; i>=1; i--)
            n = n*i;
        System.out.println("fatorial of "+a+ " is " + n);
    }
}

