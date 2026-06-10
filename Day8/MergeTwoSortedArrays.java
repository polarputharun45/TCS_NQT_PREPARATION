package Day8;
import java.util.*;
public class MergeTwoSortedArrays {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a= new int[5];
        int []b= new int[5];

        System.out.println("enter numbers of arr1 ");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
         
        System.out.println("enter numbers of arr2");
        for (int i = 0; i < b.length; i++) {
            b[i]=sc.nextInt();
        }


        int c[]=new int[a.length+b.length];

        int i=0;
        int j=0;
        int k=0;

        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
            }
            else{
                c[k]=b[j];
                
                j++;
            }
            k++;
        }
        while(i<a.length){
            c[k]=a[i];
            i++;
            k++;
        }
        while(i<b.length){
            c[k]=b[i];
            i++;
            k++;
        }
        for(int n:c){
            System.out.print(n);
        }
    }
}
