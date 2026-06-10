package Day8;

import java.util.*;

public class MajorityElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("enter numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);

            } else {
                map.put(num, 1);
            }

        }
        boolean found = false;

        for (int key : map.keySet()) {

            if (map.get(key) > arr.length / 2) {
                System.out.println(key);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Majority Element");
        }

    }

}
