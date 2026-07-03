package Day15;

import java.util.Scanner;

public class EvenNumberCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the elements count ");
        int n = sc.nextInt();


        int []arr = new int[n];

        System.out.println("enter elements");
        for(int i = 0; i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;

        for(int i=0; i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println("count of even numbers  "+count);
    }
}
