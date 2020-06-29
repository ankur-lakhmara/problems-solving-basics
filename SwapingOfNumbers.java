import java.util.Scanner;

public class SwapingOfNumbers {
    public static void main(String[]arg){
        System.out.println("Enter numbers for swapping");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        int t;
        t = a;
        a = b;
        b = t;
        {
            System.out.println("The swapped numbers are "+a+" and "+b);
        }
    }
}
