package Day8;
import java.util.*;
public class FindKthLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr=new int[5];


        System.out.println("enter numbers");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        Arrays.sort(arr);
        int k=3;
        

        int result=arr[arr.length-k];

        System.out.print(result+" ");



    }
}
