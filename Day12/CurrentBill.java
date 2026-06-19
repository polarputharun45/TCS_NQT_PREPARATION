package Day12;
import java.util.Scanner;
public class CurrentBill {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("enter bill amount");

        int n= sc.nextInt();
        int bill=0;

        if(n<=100){
            bill=n*5;
        }
        else if(n<=200){
            bill=100*5 +(n-100)*7;
        }
        else{
            bill=100*5+100*7+(n-200)*10;


        }
        System.out.println(bill);


    }
}
