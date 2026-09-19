package VeevaSystems;

import java.util.*;

public class SearchingInClockWiseRotatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        isFound(arr, target);
    }

    public static void isFound(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (target == arr[mid]) {
                System.out.print("found");
                return;
            }
            if (arr[i] <= arr[mid]) {
                if (target >= arr[i] && target < arr[mid]) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            } else {
                if (target > arr[mid] && target <= arr[i]) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            }
        }
        System.out.print("Not found");
    }
}
