package Day11;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");
        int n = sc.nextInt();
        int fact = 1;

        if(n<1){
            System.out.println("invalid");
            return;
        }

        for(int i=1;i<=n;i++){
            fact=fact*i;
        }

        System.out.println(fact);
    }
}
