package Day5;
import java.util.Scanner;
public class Automorphic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int sq=n*n;
        if(sq%100==n || sq%10==n){
            System.out.println("automorphic");
        }
        else{
            System.out.println("not a automorphic");
        }

    }
}
