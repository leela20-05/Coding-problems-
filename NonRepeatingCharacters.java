package VeevaSystems;

import java.util.*;

public class NonRepeatingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        nonRepestingCharacter(str);
    }

    static void nonRepestingCharacter(String str) {

        int freq[] = new int[26];

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == ' ') {
                continue;
            }

            freq[ch - 'a']++;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == ' ') {
                continue;
            }

            if (freq[ch - 'a'] == 1) {
                System.out.print(i);
                return; // stops the entire method not only loop
                // when we use break here we are only exiting from the loop
            }
        }

        System.out.print("-1");
    }

}
