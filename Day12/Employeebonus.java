package Day12;
import java.util.Scanner;
public class Employeebonus {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("enter salary");
        int n= sc.nextInt();


        if(n<30000){
            n=n+10000;

        }
        System.out.println(n);
    }
}
