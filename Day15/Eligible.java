package Day15;

import java.util.Scanner;

public class Eligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of voters");
        int n=sc.nextInt();


        int [] arr = new int[n];

        System.out.println("enter ages of voters");
        for(int i = 0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("enter eligible criteria");
        int m = sc.nextInt();
        int count=0;


        for (int i = 0; i <arr.length; i++) {
            if(arr[i]>=m){
                count++;
            }
        }
        System.out.println("count of eligible is "+count);
    }
}
