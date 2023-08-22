package algorithm.storage.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj1012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int field[][] = new int[N][M];
            for (int j = 0; j < K; j++) {
                StringTokenizer stt = new StringTokenizer(br.readLine(), " ");
                field[Integer.parseInt(stt.nextToken())][Integer.parseInt(stt.nextToken())] = 1;
            }

            Queue<Integer> queue = new LinkedList<>();
            boolean visited[][] = new boolean[N][M];
        }
    }
}
