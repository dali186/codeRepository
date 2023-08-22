package algorithm.storage.baekjoon;

import java.util.*;

public class Boj1260 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int start = sc.nextInt();

        int graph[][] = new int[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            graph[n][m] = 1;
            graph[m][n] = 1;
        }

        dfs(graph, start);
        bfs(graph, start);
    }

    private static void dfs(int[][] graph, int start) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        boolean visited[] = new boolean[graph.length];
        stack.push(start);

        while (!stack.isEmpty()) {
            int cur = stack.pop();
            if (!visited[cur]) sb.append(cur + " ");
            visited[cur] = true;

            for (int i = graph[cur].length - 1; i >= 0; i--) {
                if (graph[cur][i] == 1 && !visited[i]) {
                    stack.add(i);
                }
            }
        }
        System.out.println(sb);
    }

    private static void bfs(int[][] graph, int start) {
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];
        queue.offer(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (!visited[current]) sb.append(current + " ");
            visited[current] = true;

            for (int i = 0; i < graph[current].length; i++) {
                if (graph[current][i] == 1 && !visited[i]) {
                    queue.add(i);
                }
            }
        }
        System.out.println(sb);
    }

}
