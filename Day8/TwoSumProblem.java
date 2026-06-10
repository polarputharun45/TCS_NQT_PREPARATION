package Day8;
import java.util.*;
public class TwoSumProblem {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            
        }
        System.out.println("enter target");
        int target=sc.nextInt();

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr [i] +" " + arr[j]);
                    return;
                }
            }
        }
    }
}
