package Day5;
import java.util.*;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n= sc.nextInt();
        int o=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+digit;
            n/=10;
            
        }
        if(o%sum==0){
            System.out.print("harshadnumber");
        }
        else{
            System.out.println("not harshadNumber");
        }
    }
}
