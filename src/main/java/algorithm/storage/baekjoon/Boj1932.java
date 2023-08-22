package algorithm.storage.baekjoon;

import java.util.Scanner;

public class Boj1932 {
    static int [][] trg;
    static Integer [][] value;
    static int N;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        trg = new int[N][N];
        value = new Integer[N][N];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < i+1; j++) {
                trg[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < N; i++) {
            value[N-1][i] = trg[N-1][i];
        }

        System.out.println(find(0,0));

    }

    static int find(int depth, int index) {
        if(depth == N-1) {
            return value[depth][index];
        }
        if(value[depth][index] == null) {
            value[depth][index] = find(depth+1, index) > find(depth+1, index +1)
                    ? find(depth+1, index) + trg[depth][index] : find(depth+1, index+1) + trg[depth][index];
        }
        return value[depth][index];
    }

}
