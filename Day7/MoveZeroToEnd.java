package Day7;
import java.util.*;
public class MoveZeroToEnd {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [] a= new int[4];
        System.out.println("enter numbers");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        int index=0;

        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                int temp=a[index];
                a[index]=a[i];
                a[i]=temp;
                index++;
            }

        }
        for(int num:a){
            System.out.print(num);
        }

    }
}
