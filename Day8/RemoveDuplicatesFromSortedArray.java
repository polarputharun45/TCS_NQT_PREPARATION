package Day8;
import java.util.*;
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[5];

        System.out.println("enter sorted array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }


        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];

            }
            
        }
        for (int k= 0; k <=i; k++) {
            System.out.print(arr[k]);
        }





    }
}
