package algorithm.storage.baekjoon;

import java.util.Scanner;

public class Boj1780 {

    static int ary[][];
    static int zero = 0;
    static int plus = 0;
    static int minus = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ary = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                ary[i][j] = sc.nextInt();
            }
        }
        partitionPaper(0,0,N);

        System.out.println(minus);
        System.out.println(zero);
        System.out.println(plus);
    }

    public static void partitionPaper(int row, int col, int n) {

        int state = ary[row][col];
        if(paperCheck(row,col,n)) {
            if (state == -1) {
                minus++;
            } else if (state == 0) {
                zero++;
            } else {
                plus++;
            }
            return;
        }

        n = n/3;

        partitionPaper(row, col, n);
        partitionPaper(row, col + n, n);
        partitionPaper(row, col + n * 2, n);
        partitionPaper(row + n, col, n);
        partitionPaper(row + n, col + n, n);
        partitionPaper(row + n, col + n * 2, n);
        partitionPaper(row + n * 2, col, n);
        partitionPaper(row + n * 2, col + n, n);
        partitionPaper(row + n * 2, col + n * 2, n);
    }

    public static boolean paperCheck(int row, int col, int n) {

        int state = ary[row][col];

        for (int i = row; i < row + n; i++) {
            for (int j = col; j < col + n; j++) {
                if (ary[i][j] != state) {
                    return false;
                }
            }
        }
        return true;
    }
}
