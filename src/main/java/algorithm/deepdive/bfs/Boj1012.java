package algorithm.deepdive.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//BFS, 유기농 배추
//https://www.acmicpc.net/problem/1012
public class Boj1012 {
    static int row;
    static int col;
    static int [][] graph;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        int reps = Integer.parseInt(reader.readLine());
        for (int i = 0; i < reps; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");
            row = Integer.parseInt(tokenizer.nextToken());
            col = Integer.parseInt(tokenizer.nextToken());
            int vertexes = Integer.parseInt(tokenizer.nextToken());

            graph = new int[row][col];
            visited = new boolean[row][col];
            for (int j = 0; j < vertexes; j++) {
                StringTokenizer elementsTokenizer = new StringTokenizer(reader.readLine(), " ");
                int x = Integer.parseInt(elementsTokenizer.nextToken());
                int y = Integer.parseInt(elementsTokenizer.nextToken());
                graph[x][y] = 1;
            }
            int warms = 0;
            while (anyXY()[0] != -1 && anyXY()[1] != -1) {
                int[] target = anyXY();
                warms++;
                bfs(target[0], target[1]);
            }
            builder.append(warms + "\n");
        }
        System.out.println(builder);
    }

    private static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,y});
        visited[x][y] = true;
        graph[x][y] = 0;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentX = current[0];
            int currentY = current[1];
            for (int i = 0; i < 4; i++) {
                int adjacencyX = currentX + dx[i];
                int adjacencyY = currentY + dy[i];
                if (adjacencyX < 0 || adjacencyY < 0 || adjacencyX >= row || adjacencyY >= col) continue;
                if (visited[adjacencyX][adjacencyY] || graph[adjacencyX][adjacencyY] == 0) continue;
                queue.offer(new int[]{adjacencyX, adjacencyY});
                visited[adjacencyX][adjacencyY] = true;
                graph[adjacencyX][adjacencyY] = 0;
            }
        }
    }

    private static int[] anyXY() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (graph[i][j] == 1) return new int[]{i,j};
            }
        }
        return new int[]{-1, -1};
    }
}
