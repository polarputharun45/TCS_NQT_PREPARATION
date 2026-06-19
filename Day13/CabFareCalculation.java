package Day13;

import java.util.Scanner;

public class CabFareCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter kms");
        int n = sc.nextInt();

        int basefare=50;
        int kmsfare= n*12;
        int sum= kmsfare+basefare;


        System.out.println("total amount "+sum);
    }
}
