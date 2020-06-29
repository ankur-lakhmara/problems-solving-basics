import java.util.Scanner;

public class LeapYear {
    public static void main(String[]arg) {
        System.out.println("Enter any year to check leap or not");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 4 == 0) {
            if (n % 100 == 0) {
                if (n % 400 == 0) {
                    System.out.println("this is leap year");
                } else {
                    System.out.println("this is not a leap year");
                }
            }
            else{
                System.out.println("this is a leap year");
            }
        }
        else{
            System.out.println("not a leap year");
                }
            }
        }
