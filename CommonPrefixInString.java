package VeevaSystems;

import java.util.*;

public class CommonPrefixInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = sc.nextInt();
        String arr1[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.next();
        }
        System.out.println("Enter m value");
        int m = sc.nextInt();
        String arr2[] = new String[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.next();
        }
        List<String> list = commonPrefix(n, m, arr1, arr2);
        System.out.print(list);
    }

    public static List<String> commonPrefix(int n, int m, String[] arr1, String[] arr2) {
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i].charAt(0) == arr2[j].charAt(0)) {
                    al.add(arr1[i]);
                    al.add(arr2[j]);
                }
            }
        }
        return al;
    }
}
