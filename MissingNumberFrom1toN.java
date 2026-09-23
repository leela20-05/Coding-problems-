// you are given an array of elements we  need to find the missing elements form that 
package VeevaSystems;

import java.util.*;

public class MissingNumberFrom1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        missingElement(n, arr);
    }

    public static void missingElement(int n, int arr[]) {
        for (int i = 1; i < n; i++) {
            if (arr[0] > 1) {
                System.out.print("1");
                return;
            }
            if (arr[i] - arr[i - 1] == 2) {
                int num = arr[i] - 1;
                System.out.print(num);
                return;
            }
        }
    }
}
