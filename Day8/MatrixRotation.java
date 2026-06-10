package Day8;
import java.util.*;
public class MatrixRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers");
        int [][]a=new int[3][3];
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){

                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=a[i][j];

            }
        }
        for(int i=0;i<a.length;i++){
            for (int j = 0; j < a.length; j++) {
                
                int left =0;
                int right=a.length-1;


                while(left<right){

                    int temp=a[i][left];
                    a[i][left]=a[j][right];
                    a[j][right]=temp;
                    left++;
                    right--;

                }





            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
        }
        System.out.println();

        



    }
}
