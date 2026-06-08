package Day4;
import java.util.*;
public class SumOfArray {
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            int [] arr= new int[5];
            int sum=0;
        
            System.out.println("enter array");
            for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.nextInt();
                
            }
            for(int i =0;i<arr.length;i++){
                sum=sum+arr[i];

            }
            System.out.println(sum);


        }
    
}
