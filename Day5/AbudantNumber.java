package Day5;

import java.util.Scanner;

public class AbudantNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int orig=n;
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
        if(orig<sum){
            System.out.println("abudant");
        }
        else{
            System.out.println("not abudant");
        }

    }

}
