package Day8;
import java.util.*;
public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] s= new String[5];
        System.out.println("enter the strings");
        for(int i=0;i<s.length;i++){
            s[i]=sc.nextLine();
        }
        String prefix =s[0];

        for (int i = 0; i < s.length; i++) {
            while(s[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        System.out.println(prefix);
    }
    
}
