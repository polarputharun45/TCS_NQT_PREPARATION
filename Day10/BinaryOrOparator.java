import java.util.Scanner;
public class BinaryOrOparator{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");

        int n= sc.nextInt();
        int m= sc.nextInt();

        System.out.println(n|m);
    }
}