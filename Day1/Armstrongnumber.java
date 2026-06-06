import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");

        int n = sc.nextInt();

        int original = n;
        int temp = n;

        int count = 0;
        int sum = 0;

        while(temp > 0){
            count++;
            temp = temp / 10;
        }

        temp = n;

        while(temp > 0){
            int digit = temp % 10;
            sum += (int)Math.pow(digit, count);
            temp /= 10;
        }

        if(original == sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }
    }
}