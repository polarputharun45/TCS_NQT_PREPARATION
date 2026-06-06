package Day2;
import java.util.Scanner;
public class Gcd {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int max=(int)Math.max(n1,n2);
        int min=(int)Math.min(n1,n2);
        while(min!=0){
            int reminder=max%min;
            max=min;
            min=reminder;
        }
        System.out.println(max);

    }
    
}
