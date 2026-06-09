package Day7;
import java.util.*;
public class RotateArray {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int []a=new int[3];
        System.out.println("Enter numbers");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int last=a[a.length-1];
        for(int i=a.length-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=last;
        for(int num:a){
            System.out.print(num);

        }
        

    }
}
