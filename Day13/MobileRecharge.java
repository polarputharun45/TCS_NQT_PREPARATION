package Day13;

import java.util.Scanner;

public class MobileRecharge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("enter recharge amount");
        int n= sc.nextInt();

        if(n==199){
            System.out.println("28days plan");
        }
        else if(n==399){
            System.out.println("56 days plan");
        }
        else if(n==599){
            System.out.println("84 dayas plan");
        }



        else if ( n==199 || n==399 || n==599){
            System.out.println("valid");
        }
        else{
            System.out.println("not valid");
        }
       

    }
}
