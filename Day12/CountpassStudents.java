package Day12;
import java.util.Scanner;
public class CountpassStudents {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");


        int arr[]=new int[5];
        int count=0;
        System.out.println("enter marks");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=40){
                count++;
            }
        }
        System.out.println(count);
    }
}
