package storage.baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Boj1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int times[][] = new int[N][2];
        for (int i = 0; i < N; i++) {
            times[i][0] = sc.nextInt();
            times[i][1] = sc.nextInt();
        }

        Arrays.sort(times, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int cnt = 0;
        int pre = 0;
        for (int i = 0; i < N; i++) {
            if (pre <= times[i][0]) {
                pre = times[i][1];
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
