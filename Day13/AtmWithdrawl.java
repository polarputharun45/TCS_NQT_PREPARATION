package Day13;
import java.util.Scanner;
public class AtmWithdrawl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount");
        int n= sc.nextInt();
        int m=20000;
    
        if(n<=m){
            System.out.println("withdrawl of "+n+" is successfully completed");

        }
        else{
            System.out.println(" insufficient balence");

        }



    }
}
