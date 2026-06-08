package Day3;
import java.util.*;
public class Anagram {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter words");

        String a=sc.nextLine();
        String b=sc.nextLine();
        if(a.length()!=b.length()){
            System.out.println("not a anagram");
           
        }
        
        char[] n=a.toCharArray();
        char[] m=b.toCharArray();

        Arrays.sort(n);
        Arrays.sort(m);


        if(Arrays.equals(n,m)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("not a anagram");
        }



    }
    
}
