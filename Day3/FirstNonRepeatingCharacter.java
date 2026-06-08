package Day3;

import java.util.*;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter word");
        String s = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }

        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.get(ch)== 1) {
                System.out.println(ch);
                break;
            } else {
                System.out.println("no non repeat");
            }

        }

    }
}
