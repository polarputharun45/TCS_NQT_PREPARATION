package Day13;

import java.util.Scanner;

public class EmployeeAttendence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter string");
        String s = sc.nextLine();
        int countp=0;
        int counta=0;


        for(Character ch : s.toCharArray()){
            if(ch=='p'){
                countp++;
            }
            else if(ch=='a'){
                counta++;
            }
            else{
                System.out.println("leave");

            }
        }
        System.out.println(countp);
    }
}
