package Day7;

import java.util.*;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] c = new int[2][2];

        System.out.println("enter number");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                c[i][j]=0;
                for(int k=0;k<c.length;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }

            }

        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(c[i][j]+" ");
                
            }
            System.out.println();
        }
        

    }
}
