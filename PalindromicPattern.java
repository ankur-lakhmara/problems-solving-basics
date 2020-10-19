import java.util.Scanner;

public class PalindromicPattern {
    public static void main(String[]arg){
        System.out.println("Enter an int number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1;i<=n;i++){
            int j;
            for( j=1;j<=n-i;j++) {
                System.out.print("  ");
            }
            int k=i;
            for(;j<=n;j++){
                System.out.print(k--+" ");
            }
            k=2;
            for(;j<=n+i-1;j++){
                System.out.print(k+++" ");
            }
            System.out.println();
        }
    }
}
/*Output is :
Enter an int number
10
                  1 
                2 1 2 
              3 2 1 2 3 
            4 3 2 1 2 3 4 
          5 4 3 2 1 2 3 4 5 
        6 5 4 3 2 1 2 3 4 5 6 
      7 6 5 4 3 2 1 2 3 4 5 6 7 
    8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 
  9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 
10 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 10
        */
