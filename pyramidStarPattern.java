import java.util.Scanner;

public class pyramidStarPattern {
    public static void main(String[]arg){
        System.out.println("ENter int Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
                }
            System.out.println();
            }
         /*   this is used to print
                *
               ***
              *****
             *******
            *********
            */

        for(int i=n;i>=1;i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");

            }
            System.out.println();
        }
            /* this is used to print
            *********
             *******
              *****
               ***
                *
             */
    }
}
