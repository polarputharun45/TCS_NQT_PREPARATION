package Day15;
import  java.util.*;
public class MeetingBatteryLife {
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many batteries");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i =0; i<arr.length;i++){
            arr[i]=sc.nextInt();


        }
        System.out.println("enter meeting duration");
        int m = sc.nextInt();

        int count = 03;

        for(int i= 0; i<arr.length;i++){
            if(m<=arr[i]){
                count++;
            }
        }


        System.out.println("count ="+count);


        

    }
    
}
