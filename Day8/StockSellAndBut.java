package Day8;

import java.util.*;

public class StockSellAndBut {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];

        System.out.println("enter prizes");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int minprice = arr[0];
        int maxprofit = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minprice) {
                minprice = arr[i];

            }
            int profit = arr[i] - maxprofit;

            if (profit > maxprofit) {
                maxprofit = profit;
            }
        }
        System.out.println(minprice+" ");
        System.out.println(maxprofit+" ");

    }
}
