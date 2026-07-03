package Day15;

import java.util.*;

public class CountPositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("enter number count");
        int n = sc.nextInt();

        int arr[] = new int[n];


        System.out.println("enter numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            
        }
        int positive =0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                positive++;


            }
        }
        System.out.println("positive numbers count is "+positive);



    }
}
