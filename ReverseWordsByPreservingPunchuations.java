package VeevaSystems;

import java.util.*;

public class ReverseWordsByPreservingPunchuations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        reverseWords(s);
    }

    public static void reverseWords(String s) {
        String s1[] = s.split("[^a-zA-Z]+");
        int n = s1.length - 1;
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isLetter(ch)) {
                res = res + ch;
            } else {
                res = res + s1[n];
                n--;
                while (i + 1 < s.length() && Character.isLetter(s.charAt(i + 1))) {
                    i++;
                }
            }
        }
        System.out.print(res);
    }
}
