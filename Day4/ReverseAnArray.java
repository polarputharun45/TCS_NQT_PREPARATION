package Day4;

import java.util.*;

public class ReverseAnArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int[] arr2 = new int[5];
        System.out.println("enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int j=0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[j] = arr[i];
            j++;

        }
        for (j = 0; j < arr2.length; j++) {
            System.out.print(arr2[j] + " ");
        }
        sc.close();
    }

}
