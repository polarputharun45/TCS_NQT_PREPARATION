package Day13;
import java.util.Scanner;
public class LibraryFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter total days");
        int n=sc.nextInt();

        // System.out.println(n*2);


        System.out.println("enter limit days");
        int  tym= sc.nextInt();

        if(n<tym){
            System.out.println("no fine");
        }
        else{
            int fine = n-tym;
            System.out.println("total fine = "+fine+"days extra so "+fine*2);
        }

    }
}
