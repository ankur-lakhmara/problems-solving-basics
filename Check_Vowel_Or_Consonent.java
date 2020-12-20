package Online_coding_problems;

import java.util.Scanner;

public class Check_Vowel_Or_Consonent {
    public static void main(String[]args){
        System.out.println("Enter the alphabet to check Vowel or Consonent");
        Scanner abc = new Scanner(System.in);
        char mychar = abc.next().charAt(2);
        if(mychar=='a' || mychar=='b' || mychar=='i' || mychar=='o' || mychar=='u'){
            System.out.println("the character is vowel");
        }
        else{
            System.out.println("Character is consonent");
        }
    }
}
