import java.util.Scanner;

public class SwappingWithoutUsingThirdVariable {
    public static void main(String[]arg){
        System.out.println("Enter numbers for swapping");
        Scanner sc = new Scanner(System.in); //in my case i use sc class for scanner you may change it and also change in Int 
        System.out.println("enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        a = a+b; 
        b = a-b;
        a = a-b;
        {
            System.out.println("numbers after swapping is "+a+ " and "+b);
        }

    }
}
