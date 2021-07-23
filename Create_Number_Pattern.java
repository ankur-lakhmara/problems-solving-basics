package Code_brush_Up;

import java.util.Scanner;

public class Create_Number_Pattern {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        for(i = 1 ;i<=n; i++){
            for(j = 1; j<= i ;j++){
                System.out.print(j);
            }
            for(int k = n;k>i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/* output is
5
1****
12***
123**
1234*
12345

 */
