package Day11;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");
        int n = sc.nextInt();
        int orig=n;
        int temp =n;
        int sum=0;
        int count=0;


        while(temp>0){
            int dig = temp%10;
            count++;
            temp/=10;

        }
        temp =n;

        while(temp>0){
            int dig=temp%10;
            sum=sum+(int)Math.pow(dig,count);
            temp/=10;
        }

        if(orig==sum){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
}
