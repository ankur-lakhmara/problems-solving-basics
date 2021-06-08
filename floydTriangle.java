
import java.util.Scanner;

public class floydTriangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers of Rows");
        int n = sc.nextInt();
        int i,j,k=1;
        for( i=0; i<=n;i++){
            for ( j=1;j<=i;j++){
                System.out.print(k +" ");
                k++;
            }
            System.out.println();
        }
    }
}

/*Enter Numbers of Rows
5

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

Process finished with exit code 0

*/
