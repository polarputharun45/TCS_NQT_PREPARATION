package Day7;
import java.util.*;
public class IntersectionElementsInArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int []a=new int[3];
        int []b=new int[3];
         
        System.out.println("enter 1st numbers");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter 2nd numbers");
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        // for(int i=0;i<a.length;i++){
        //     for(int j=0;j<b.length;j++){
        //         if(a[i]==b[j]){
        //             System.out.print(a[i]+" ");
        //             break;
        //         }
        //     }
        // }

        HashSet<Integer> set =new HashSet<>();
        for( int num:a){
            set.add(num);
        }
        for(int num:b){
            if(set.contains(num)){
                System.out.print(num+" ");
            }
        }

    }
}
