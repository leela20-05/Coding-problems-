package VeevaSystems;

import java.util.*;

public class SmallestAbsValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        absoluteDifference(n, arr, target);
    }

    static void absoluteDifference(int n, int[] arr, int target) {
        int val = Integer.MAX_VALUE;
        int abs = 0;
        int num = 0;

        for (int i = 0; i < n; i++) {
            if (n == 1) {
                System.out.print(arr[i]);
            }
            if (target < arr[i]) {
                abs = arr[i] - target;
            } else {
                abs = target - arr[i];
            }
            if (abs < val) {
                val = abs;
                num = arr[i];
            }
            if (abs == val) {
                if (num < arr[i]) {
                    num = arr[i];
                }
            }

        }
        System.out.print(num);
    }
}
