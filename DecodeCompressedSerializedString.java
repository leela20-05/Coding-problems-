package VeevaSystems;

import java.util.*;

public class DecodeCompressedSerializedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = decode(str);
        System.out.print(res);
    }

    public static String decode(String str) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        int number = 0;
        String currentString = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(number);
                stringStack.push(currentString);
                number = 0;
                currentString = "";
            } else if (Character.isLetter(ch)) {
                currentString += ch;
            } else {
                String previousString = stringStack.pop();
                int count = countStack.pop();
                String repeatedString = "";
                for (int j = 0; j < count; j++) {
                    repeatedString += currentString;
                }
                currentString = previousString + repeatedString;
            }
        }
        return currentString;
    }
}
