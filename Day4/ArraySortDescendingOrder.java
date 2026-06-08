package Day4;
import java.util.*;
public class ArraySortDescendingOrder {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[5];
        System.out.println("enter numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

            
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int c= arr[j];
                    arr[j]=arr[i];
                    arr[i]=c;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(" " +arr[i]);
        }
        sc.close();


    }


}
