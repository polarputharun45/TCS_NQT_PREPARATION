package Day4;
import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[3];
        System.out.println("enter values");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int n=arr.length+1;
        int expectedsum=n*(n+1)/2;
        int actual=0;

        for(int i =0; i<arr.length;i++){
            actual=actual+arr[i];

        }
        int missing = expectedsum-actual;
        System.out.println(missing);

    }
}
