// finding Minimum ,Maximum and 2nd Largest Element in an unsorted array without Sorting 
package VeevaSystems;

import java.util.*;

public class MinMaxAnd2ndLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        minMax(n, arr);
    }

    public static void minMax(int n, int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < max) {
                secondLargest = Math.max(secondLargest, arr[i]);
            }
        }

        System.out.println("Maximum : " + max);
        System.out.println("Minimum : " + min);
        System.out.println("SecondLargest : " + secondLargest);
    }
}
