package algorithm.storage.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//삼성역량, 구슬 탈출 2
//https://www.acmicpc.net/problem/13460
public class Boj13460 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(input.readLine(), " ");
        int col = Integer.parseInt(tokenizer.nextToken());
        int row = Integer.parseInt(tokenizer.nextToken());
        char[][] map = new char[row][col];
        for (int i = 0; i < col; i++) {
            String line = input.readLine();
            for (int j = 0; j < row; j++) {
                map[i][j] = line.charAt(j);
            }
        }
        //조건 입력
        int[][] visited = new int[row][col];
        
    }
}
