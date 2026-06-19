package Day12;
import java.util.Scanner;

public class BusSeatsAvailable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter total seats");
        int n= sc.nextInt();

        System.out.println("enter booked seats count");
        int m= sc.nextInt();

        int remain=n-m;


        System.out.println("remain available seat are   " +remain);
    }
}
