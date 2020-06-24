package sample;
import java.util.Scanner;
public class Main{
    public static void main(String[]arg){
        System.out.println("Enter any Int number to sum their digits");
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        int temp = digit; // we'll store the digit modulus value in the temp
        int sum = 0; //
        while(temp>0){
            int lastdigit = temp%10;  // the modulus of any number by ten is the last number of the digit
            temp /= 10;
            sum += lastdigit;  // if you want to see how this loop works (: remove comment of line 14th
            //System.out.println(lastdigit+" " +temp+" "+sum);
        }
        System.out.println("the sum of "+digit+" is "+ sum);
    }
}