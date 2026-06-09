package Day6;
import java.util.*;
public class Alphabetstriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        char ch ='A';
        int num =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                
                System.out.print(ch);
                System.out.print(num);
                ch++;
                num++;
            }
            System.out.println();
        }
    }
}
