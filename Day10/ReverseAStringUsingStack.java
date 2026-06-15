 
 import java.util.*;
 public class  ReverseAStringUsingStack {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        

        System.out.println("enter string");
        String name =sc.nextLine();

        Stack<Character> s = new Stack<>();

        for(int i=0;i<name.length();i++){
            s.push(name.charAt(i));
        }

        System.out.println("reversedString");
        while(!s.isEmpty()){
            System.out.print(s.pop());
        }

        


    }

    
}
