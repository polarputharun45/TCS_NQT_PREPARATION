package Day3;
import java.util.Scanner;
public class PalindromeString {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String s =sc.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("string is not palindrome");
        }

    }
    
}
