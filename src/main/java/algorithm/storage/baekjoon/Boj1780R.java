package storage.baekjoon;

import java.util.Scanner;

public class Boj1780R {
    static int paper[][];   //입력이 들어갈 배열
    static int pos = 0;     //1
    static int zero = 0;    //0
    static int neg = 0;     //-1

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        paper = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                paper[i][j] = sc.nextInt();
            }
        }
        partition(0, 0, N);
        System.out.println(neg);
        System.out.println(zero);
        System.out.println(pos);
    }

    public static void partition(int row, int col, int n) {
        int state = paper[row][col];    //분할된 배열의 기준 값
        if (isPaper(row, col, n)) {
            if (state == -1) {
                neg++;
            } else if (state == 0) {
                zero++;
            } else {
                pos++;
            }
        }

        n /= 3;

        partition(row, col, n);     //상단좌측
        partition(row, col + n, n);     //상단중앙
        partition(row, col + n * 2, n);     //상단우측
        partition(row + n, col, n);     //중단좌측
        partition(row + n, col + n, n);     //중단중앙
        partition(row + n, col + n * 2, n);     //중단우측
        partition(row + n * 2, col, n);     //하단좌측
        partition(row + n * 2, col + n, n);     //하단중앙
        partition(row + n * 2, col + n * 2, n);     //하단우측
    }

    public static boolean isPaper(int row, int col, int n) {
        int state = paper[row][col];    //분할된 배열의 기준 값
        for (int i = row; i < row + n; i++) {
            for (int j = col; j < col + n; j++) {
                if (paper[i][j] != state) {
                    return false;
                }
            }
        }
        return true;
    }

}
