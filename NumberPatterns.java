import java.sql.SQLOutput;
import java.util.Scanner;

public class NumberPatterns {
    public static void main(String[]arg){
        System.out.println("Enter int number");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }
}
//basic program for printing numbers in a particular pattern
