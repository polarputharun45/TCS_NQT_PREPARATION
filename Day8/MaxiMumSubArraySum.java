package Day8;
import java.util.*;
public class MaxiMumSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("enter numbers");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //12345//
        int csum=0;
        int msum=arr[0];
        for(int i=0;i<arr.length;i++){
            csum=csum+arr[i];

            if(csum>msum){
                msum=csum;
                
            }
            if(csum<0){
                csum=0;
            }

        }
        System.out.println("msum  "+msum);





    }
    
}
