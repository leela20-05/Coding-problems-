// you are given an array of Elements and  you need to remove duplicates from the elements
// we can do this in many ways. My approach is using arrayList and 2nd approach is using hashSet 
package VeevaSystems;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        removeDuplicates(n, arr);
    }

    public static void removeDuplicates(int n, int[] arr) {
        // ArrayList<Integer> al = new ArrayList<>();
        // for (int i = 0; i < n; i++) {
        // if (!al.contains(arr[i])) {
        // al.add(arr[i]);
        // }
        // }
        // System.out.print(al);

        // 2nd Method
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(arr[i]);
        }
        System.out.print(hs);
    }
}
