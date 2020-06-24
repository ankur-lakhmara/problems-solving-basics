package sample;
import java.util.Scanner;
public class Main{
    public static void main(String[]arg){
        System.out.println("Enter any number");
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while(temp>0){
            int lastDigit = temp%10;  //when we divide any number by 10 than its last digit is remender
            rev = rev * 10 + lastDigit;  // to store the last digit and multiply by 10 and add last digit in the getting result(Number)
            temp/= 10; //reintialization of loop
        }
        if(rev == n){
            System.out.println(n+" is palindrome");
        }
        else {
            System.out.println(n+" is not palindrome");
        }
    }
}