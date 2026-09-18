package VeevaSystems;
// import java.util.*;

// public class LongestSubstringWithoutRepeatingCharacters {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         longestSubstring(str);
//     }

//     public static void longestSubstring(String str) {
//         ArrayList<Character> al = new ArrayList<>();
//         int max = 0;
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             while (al.contains(ch)) {
//                 al.remove(0);
//             }
//             al.add(ch);
//             max = Math.max(max, al.size());
//             // The reason we keep max is that there are other
//             // inputs where the final list is smaller than the maximum list size reached
//             // earlier.
//         }
//         System.out.print(max);
//     }
// }
// In this case the Time complexity is o(n^2) . Because al.contains can take
// o(n) and al.remove() also takes o(n)

// 2 .Best Methos for this problem is using "HASH MAP SLIDING WINDOW APPROACH"

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        isLongest(s);
    }

    public static void isLongest(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int left = 0;
        int max = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (hm.containsKey(ch)) {
                left = Math.max(left, hm.get(ch) + 1);
            }
            hm.put(ch, right);

            max = Math.max(max, (right - left) + 1);
        }
        System.out.print(max);
    }
}
