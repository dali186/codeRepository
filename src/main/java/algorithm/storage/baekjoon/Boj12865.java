package storage.baekjoon;

import java.util.Scanner;

public class Boj12865 {
    static int items[][];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        items = new int[N][2];
        int K = sc.nextInt();

        for(int i = 0; i < N; i++) {
            items[i][0] = sc.nextInt();
            items[i][1] = sc.nextInt();
        }

    }
}
