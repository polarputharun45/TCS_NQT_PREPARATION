package Day15;
import java.util.*;
public class SecondLargest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("enter elements");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int max =  Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                secondlargest = max;
                max=arr[i];


            }
            else if (arr[i]>max && arr[i]!=max){
                secondlargest = arr[i];

            }

            
        }
        System.out.println("lagest element is  "+ secondlargest);



    }
}
