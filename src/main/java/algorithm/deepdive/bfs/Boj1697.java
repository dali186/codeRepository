package algorithm.deepdive.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//BFS, 숨바꼭질
//https://www.acmicpc.net/problem/1697
public class Boj1697 {
    static int N;
    static int K;
    static int[] dx = {-1, 1, 2};
    static int[] map;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");
        N = Integer.parseInt(tokenizer.nextToken());
        K = Integer.parseInt(tokenizer.nextToken());
        map = new int[100001];
        visited = new boolean[100001];
        System.out.println(bfs(N));
    }

    private static int bfs(int N) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(N);
        visited[N] = true;
        map[N] = 1;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int i = 0; i < 3; i++) {
                int adjacency = 0;
                if (i == 2) {
                    adjacency = current * dx[i];
                } else {
                    adjacency = current + dx[i];
                }

                if (adjacency < 0 || adjacency >= 100001) continue;
                if (visited[adjacency]) continue;
                queue.offer(adjacency);
                visited[adjacency] = true;
                map[adjacency] = map[current] + 1;
                if (adjacency == K) return (map[adjacency] - 1);
            }
        }
        return -1;
    }
}
