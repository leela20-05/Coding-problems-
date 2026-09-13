package VeevaSystems;

import java.util.*;

public class SumNumbersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int res = sumNumbers(s);
        System.out.print(res);
    }

    public static int sumNumbers(String s) {
        int num = 0;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
                // Here we are writing ch-'0' because ch is not converted as integer we just
                // verified wheather it is an integer or not
                // so basically 5 represent its ascii value so we have to do - '0' so that we
                // can
                // get actual integer value

                // Integer.toString(ch) here ch is converted into its unicode/ASCII integer
                // value so 5 becomes 53 not 5
                // so correct way to check wheather it is an integer or not is using
                // character.isDigit(ch)
            } else {
                sum = sum + num;
                num = 0;
            }
        }
        sum = sum + num;
        return sum;
    }

}
