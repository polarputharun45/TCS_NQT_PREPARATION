package Day4;
import java.util.*;
public class MergeTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[5];
        int arr2[]= new int[5];
        System.out.print("Enter elements of arr");
        for (int i = 0; i < arr2.length; i++) {
            arr[i]=sc.nextInt();
        
        }
        System.out.print("enter numbers arr2");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=sc.nextInt();
        }
        int [] merge =new int[arr.length  + arr2.length];
        int k=0;
        for(int i=0;i<arr.length;i++){
            merge[k]=arr[i];
            k++;
        }
        for(int j=0;j<arr2.length;j++){
            merge[k]=arr2[j];
            k++;
        }
        for(int i=0;i<merge.length;i++){

            System.out.print(merge[i]+" ");
        }


    }
    
}
