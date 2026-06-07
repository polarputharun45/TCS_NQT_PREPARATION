package Day3;

import java.util.Scanner;

public class CountVowelsConsonents {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter word");
        String s = sc.nextLine();
        int vowels = 0;
        int consonents = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ("aeiou".contains(String.valueOf(ch))) {
                vowels++;
            } else if (Character.isLetter(ch)) {
                consonents++;
            }
        }
        System.out.println(vowels);
        System.out.println(consonents);

    }
}
