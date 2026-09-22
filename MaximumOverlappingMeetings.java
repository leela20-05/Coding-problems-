package VeevaSystems;

import java.util.*;

public class MaximumOverlappingMeetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int start[] = new int[N];
        int end[] = new int[N];
        for (int i = 0; i < N; i++) {
            start[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            end[i] = sc.nextInt();
        }
        int count = overlappingMeetingsCount(N, start, end);
        System.out.print("Max count : " + count);
    }

    public static int overlappingMeetingsCount(int N, int[] start, int[] end) {
        Arrays.sort(start);
        Arrays.sort(end);
        int count = 0;
        int max = 0;
        int i = 0;
        int j = 0;
        while (i < N && j < N) {
            if (start[i] < end[j]) {
                count++;
                i++;
            } else {
                count--;
                j++;
            }
            max = Math.max(max, count);
        }
        return max;

    }
}
