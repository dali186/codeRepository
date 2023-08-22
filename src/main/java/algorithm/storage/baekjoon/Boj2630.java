package algorithm.storage.baekjoon;

import java.util.Scanner;

public class Boj2630 {
    public static int ary[][];
    public static int white = 0;
    public static int blue = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ary = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                ary[i][j] = sc.nextInt();
            }
        }
        partition(0,0,N);

        System.out.println(white);
        System.out.println(blue);
    }

    public static void partition(int row, int col, int n) {

        if(check(row,col,n)) {
            if(ary[row][col] == 0) {
                white++;
            }
            else {
                blue++;
            }
            return;
        }

        n = n / 2;

        partition(row, col + n, n);//1사분면
        partition(row, col, n); //2사분면
        partition(row + n, col, n);//3사분면
        partition(row + n, col + n, n);//4사분면
    }

    public static boolean check(int row, int col, int n) {

        int color = ary[row][col];

        for(int i = row; i < row + n; i++) {
            for(int j = col; j < col + n; j++) {
                if(ary[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}
