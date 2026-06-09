package Day7;

import java.util.Scanner;

public class BinarySearchTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr =new int[5];
        System.out.println("enter numbere");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter taget");
        int t=sc.nextInt();
        int low=0;
        int high=arr.length-1;
        boolean found=false;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==t){
                found=true;
                break;

                
            }
            else if(t>arr[mid]){
                low = mid+1;
                

            }
            else{
                high=mid -1;
            }

        }
         if(found) {
            System.out.println("Found " + t);
        }
        else {
            System.out.println("Not Found");
        }


    }
}
