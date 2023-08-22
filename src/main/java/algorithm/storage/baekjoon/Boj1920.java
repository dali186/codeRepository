package storage.baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Boj1920 {

    static int[] value;
    static int[] key;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        value = new int[N];
        for (int i = 0; i < N; i++) {
            value[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        key = new int[M];
        for (int i = 0; i < M; i++) {
            key[i] = sc.nextInt();
        }

        Arrays.sort(value);

        for(int i = 0; i < M; i++) {
            System.out.println(binarySearch(0, N-1, i));
        }
    }

    public static int binarySearch(int left, int right, int keyIndex) {
        if (left > right) {
            return 0;
        }

        int mid = (left + right) / 2;

        if (key[keyIndex] == value[mid]) {
            return 1;
        } else if (key[keyIndex] < value[mid]) {
            return binarySearch(left, mid - 1, keyIndex);
        } else {
            return binarySearch(mid + 1, right, keyIndex);
        }
    }

}
