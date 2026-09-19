package VeevaSystems;

import java.util.*;

public class MaxAndMinValuesInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        maxAndMin(s);
    }

    public static void maxAndMin(String s) {
        int num = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        boolean hasNumber = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
                hasNumber = true;
            } else {
                if (hasNumber) {
                    max = Math.max(max, num);
                    min = Math.min(min, num);
                    num = 0;
                    hasNumber = false;
                }
            }
        }
        if (hasNumber) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        System.out.println("Maximun : " + max);
        System.out.println("Minimum :" + min);
    }
}
