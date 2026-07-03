package Day15;

import java.util.Scanner;

public class FindMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("enter elements");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int max =  Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];


            }

            
        }
        System.out.println("lagest element is  "+ max);



    }
}
