package Day5;
import java.util.*;
public class perfectNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter perfect number");
        int n=sc.nextInt();
        int sum=0;
        for( int i=1;i<n;i++)
            {
            if(n%i==0)
            {
                sum =sum+i;
            }

        }
        if(n==sum){
            System.out.println("the number is perfect");
        }
        else{
            System.out.println("the number is not a perfect number");
        }

    }
}
