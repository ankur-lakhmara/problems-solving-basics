import java.util.Scanner;

public class IncreasingOrderNumberPattern {
    public static void main(String[]arg){
        System.out.println("ENter a int number");
        Scanner pattern = new Scanner(System.in);
        int n = pattern.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
//© DeveloperPort all right Reserved 
