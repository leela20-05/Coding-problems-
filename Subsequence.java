package VeevaSystems;

import java.util.*;

public class Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int arr1[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int arr2[] = new int[n];
        for (int j = 0; j < n; j++) {
            arr2[j] = sc.nextInt();
        }
        boolean res = isSubsequence(arr1, arr2);
        System.out.print(res);
    }

    public static boolean isSubsequence(int arr1[], int arr2[]) {
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == arr2.length) {
            return true;
        }
        return false;

    }

}
