package Day2;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[]args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int n=sc.nextInt();
    int a=0,b=1; 
    System.out.println(a+" ");
    System.out.println(b+" ");
    for(int i=1;i<=n;i++)
        {
        int c=a+b;
        System.out.print(" "+c);
        
        a=b;
        b=c;
       
        }
        

    }
    

}
