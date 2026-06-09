package Day5;
import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int original=n;
        int s=n*n;
        int sum=0;
        while(s>0){
            int digit=s%10;
            sum=sum+digit;
            s/=10;

        }
        if(original==sum){
            System.out.println("neonnumber");
        }
        else{
            System.out.println("not neon");
        }


    }
}
