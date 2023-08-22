package algorithm.deepdive.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//BFS, 미로탐색
//https://www.acmicpc.net/problem/2178
public class Boj2178 {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");
        N = Integer.parseInt(tokenizer.nextToken());
        M = Integer.parseInt(tokenizer.nextToken());

        int[][] graph = new int[N][M];
        for (int i = 0; i < N; i++) {
            String line = reader.readLine();
            for (int j = 0; j < M; j++) {
                graph[i][j] = Integer.parseInt(String.valueOf(line.charAt(j)));
            }
        }
        System.out.println(bfs(graph, 0, 0));
    }

    private static int bfs(int[][] graph, int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];

        queue.offer(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int curX = current[0];
            int curY = current[1];

            for (int i = 0; i < 4; i++) {
                int adjancencyX = curX + dx[i];
                int adjancencyY = curY + dy[i];
                if (adjancencyX < 0 || adjancencyY < 0 || adjancencyX >= N || adjancencyY >= M) continue;
                if (graph[adjancencyX][adjancencyY] != 1 || visited[adjancencyX][adjancencyY]) continue;
                queue.offer(new int[]{adjancencyX, adjancencyY});
                visited[adjancencyX][adjancencyY] = true;
                graph[adjancencyX][adjancencyY] = graph[curX][curY] + 1;
            }
        }
        return graph[N - 1][M - 1];
    }
}
