package Day14;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter amount");
        int s = sc.nextInt();

        System.out.println("enter intrest");
        int rate=sc.nextInt();

        System.out.println("enter years");
        int time = sc.nextInt();

        int Simple = (s*rate*time)/100;

        System.out.println(Simple);





    }
    
}
