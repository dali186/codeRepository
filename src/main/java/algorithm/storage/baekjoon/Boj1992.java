package storage.baekjoon;

import java.util.Scanner;

public class Boj1992 {
    static int ary[][];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ary = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                ary[i][j] = sc.nextInt();
            }
        }

    }

    public static void partitiond(int row, int col, int n) {

        n = n / 2;

        partitiond(row, col + n, n);
        partitiond(row, col, n);
        partitiond(row + n, col, n);
        partitiond(row + n, col + n, n);
    }

    public static void zip(int row, int col, int n) {

        for(int i = row; i < row + n; i++) {
            for(int j = col; j < col +n; j++) {
                
            }
        }
    }
}
