package Code_brush_Up;

import java.util.Scanner;

public class Create_Number_Star_pattern {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j,k;
        for(i=n; i>=1 ;i--){
            for(j = 1;j < i; j++){
                System.out.print(j);
            }
            for(k = n;k >= i ; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
output is 
5
1234*
123**
12***
1****
*****
 */
