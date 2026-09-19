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
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                if (ch == ')' && st.peek() == '(') {
                    st.pop();
                } else if (ch == ']' && st.peek() == '[') {
                    st.pop();
                } else if (ch == '}' && st.peek() == '{') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();

        // if(st.isEmpty()) {
        // return true;
        // }
        // else {
        // return false;
        // }
        // we can also write in this way
    }
}

// TIME COMPLEXITY - O(n)
// For each character:

// push() → O(1)
// pop() → O(1)
// peek() → O(1)
// isEmpty() → O(1)