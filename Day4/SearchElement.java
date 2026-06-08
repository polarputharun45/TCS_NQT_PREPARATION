package Day4;
import java.util.*;
public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr =new int[5];
        System.out.println("enter numbers");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter number");
        int target=sc.nextInt();
        boolean found =false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                found = true;
                System.out.println("found"+arr[i]);
                break;

                
            }
            else{
                System.out.println("not found");
            }
        }

        sc.close();
    }
}
