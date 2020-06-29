import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[]arg){
        System.out.println("enter Int Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp =0;
        for(int i=2; i<=n-1; i++)
        {
            if(n%i ==0)
            {
                temp = temp+1;
            }
        }
        if(temp>0){
            System.out.println(n+" is not prime");
        }
        else{
            System.out.println(n+" is prime");
        }
    }
}
