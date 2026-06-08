package Day4;
import java.util.*;
public class ArraySortAscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr =new int[4];
        System.out.println("Enter numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int c= arr[i];
                    arr[i]=arr[j];
                    arr[j]=c;
                }

            }
            
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        sc.close();
    
    }
    
}
