package Day4;
import java.util.*;
public class SecondLargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr=new int[5];
        System.out.println("enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

            
        }
        int largest=Integer.MIN_VALUE;
        int second= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second=largest;
                largest=arr[i];
                
            }
            else if(arr[i]>second && arr[i]<largest){
                second=arr[i];
            }

        }
        System.out.println(largest);
        System.out.println(second);

    }
    
}
