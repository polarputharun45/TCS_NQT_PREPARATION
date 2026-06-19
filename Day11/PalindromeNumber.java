package Day11;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");

        int n= sc.nextInt();
        int orig=n;
        int rev=0;

        while(n>0){
            int dig =n%10;
            rev=rev*10+dig;
            n=n/10;
        }
        System.out.println( "checked");


        if(rev==orig){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
