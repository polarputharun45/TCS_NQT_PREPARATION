package Day15;
import java.util.Scanner;

public class StudentsPassed {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("enter how many number of students");
        int n= sc.nextInt();


        int[]arr=new int[n];

        System.out.println("enter marks of the students");
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("enter cutof marks");
        int pass=sc.nextInt();

        int count =0;

        for(int i=0; i<arr.length;i++){
            if(arr[i]>=pass){
                count++;

            }
        }
        System.out.println("passed "+count);

        

    }
}
