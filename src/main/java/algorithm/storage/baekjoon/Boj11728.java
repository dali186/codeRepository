package storage.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Boj11728 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int array[] = new int[N+M];
        for (int i = 0; i < N + M; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            sb.append(array[i] + " ");
        }
        System.out.println(sb);
    }
}
