package VeevaSystems;

import java.util.*;

public class ValidParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean result = isValid(s);
        System.out.print(result);
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (st.isEmpty()) {
                    return false;
                }
            }

            if (ch == ')' && st.peek() == '(') {
                st.pop();
            }
            if (ch == ']' && st.peek() == '[') {
                st.pop();
            }
            if (ch == '}' && st.peek() == '{') {
                st.pop();
            }
        }
        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
