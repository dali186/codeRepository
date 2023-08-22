package storage.baekjoon;

import java.util.*;

public class Boj2805 {

    static int N, M;
    static int[] trees;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        trees = new int[N];
        for (int i = 0; i < N; i++) {
            trees[i] = sc.nextInt();
        }
        Arrays.sort(trees);
        long left = 0;
        long right = trees[N - 1];
        while (left <= right) {
            long mid = (left + right) / 2;
            long sum = 0;
            for (int i = 0; i < N; i++) {
                if (trees[i] >= mid) {
                    sum += trees[i] - mid;
                }
            }
            if (sum < M) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(right);
    }
}
