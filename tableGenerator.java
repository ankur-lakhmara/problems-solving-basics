package sample;
import java.util.Scanner;
public class tableGenerator
{
    public static void main(String[]arg)
    {
        int n, c;
        System.out.println("Enter an Number to print it's multiplication table");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Multiplication table of " + n);

        for (c = 1; c <= 10; c++)
            System.out.println(n + "*" + c + " = " + (n*c));
    }
}
