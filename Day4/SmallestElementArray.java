package Day4;
import java.util.*;
public class SmallestElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr =new int[5];
        System.out.print("enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
            
        }
        System.out.println(min);
    }
    
    
}
