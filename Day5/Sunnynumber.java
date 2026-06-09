package Day5;
import java.util.*;
public class Sunnynumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int num=n+1;
        double root=Math.sqrt(num);
        if(root==(int)root){
            System.out.println("sunnynumber");
        }
        else{
            System.out.println("not equal");
        }
    }
}
