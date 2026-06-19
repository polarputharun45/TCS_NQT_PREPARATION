package Day13;

import java.util.Scanner;

public class OnlineShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter purchased amount");
        int n = sc.nextInt();

        if(n>5000){
            System.out.println("u got 20 % discount");
        }
        else if(n>2000){
            System.out.println("u got 10 % discount");

        }
        else{
            System.out.println("no discount");
        }
    }
}
