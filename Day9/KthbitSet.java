package Day9;

import java.util.Scanner;

public class KthbitSet {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("enter bit");
        int n=sc.nextInt();
        int k=sc.nextInt();

        int num=n|(1<<k);

        System.out.println("num "+num);


    }
    
}
