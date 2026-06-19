package Day12;
import java.util.Scanner;
public class PasswordStrength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("enter password");
        String password= sc.nextLine();


        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasdigit = false;


        for(char ch : password.toCharArray()){
            if(Character.isUpperCase(ch)){
                 hasUpper = true;
            }
            else if(Character.isLowerCase(ch)){
                hasLower=true;
            }
            else if(Character.isDigit(ch)){
                hasdigit=true;
            }
        }
        if(hasUpper && hasLower && hasdigit){
            System.out.println("valid");
        }
        else{System.out.println("not valid");}
    }
}
