package Day7;
import java.util.*;
public class UnionElementsInArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[]a=new int[3];
        int[]b=new int[3];
         
        System.out.println("enter elements");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter numbers");
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();

        for(int num :a){
            set.add(num);
        }
        for(int num:b){
            set.add(num);
        }


        for(int num:set){
            System.out.print(num);
        }











    }
}
