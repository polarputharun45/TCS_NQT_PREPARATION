package Day2;
import java.util.Scanner;
public class Lcm {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int max =(int)Math.max(n1,n2);
        int min=(int)Math.min(n1,n2);
        int a=max;
        int b=min;
        while(b!=0){
            int reminder=a%b;
            a=b;
            b=reminder;
        }
        int lcm =(n1*n2)/a;
        System.out.println(lcm);
    }
    
}
