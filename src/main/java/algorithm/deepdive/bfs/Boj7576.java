package algorithm.deepdive.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//BFS, 토마토
//https://www.acmicpc.net/problem/7576
public class Boj7576 {
    static int row;
    static int col;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] farm;
    //처음부터 다 익어있을 경우, 0 출력, 다 익히지 못하는 경우 -1 출력
    //익은경우 1, 안 익어있는 경우 0
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");
        row = Integer.parseInt(tokenizer.nextToken());
        col = Integer.parseInt(tokenizer.nextToken());
        farm = new int[row][col];
        List<int[]> startVertexes = new ArrayList<>();
        for (int i = 0; i < col; i++) {
            StringTokenizer elements = new StringTokenizer(reader.readLine(), " ");
            for (int j = 0; j < row; j++) {
                int element = Integer.parseInt(elements.nextToken());
                farm[j][i] = element;
                if (element == 1) startVertexes.add(new int[]{j, i});
            }
        }
        int result = 0;
        if (!isAllZero()) {
            result = bfs(startVertexes);
            if (!isAllZero()) result = -1;
        }
        System.out.println(result);
    }

    private static int bfs(List<int[]> startVertexes) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[row][col];
        int[] lastVertex = new int[2];

        for (int j = 0; j < startVertexes.size(); j++) {
            int x = startVertexes.get(j)[0];
            int y = startVertexes.get(j)[1];
            queue.add(new int[]{x,y});
            visited[x][y] = true;
        }
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentX = current[0];
            int currentY = current[1];
            for (int i = 0; i < 4; i++) {
                int adjacencyX = currentX + dx[i];
                int adjacencyY = currentY + dy[i];
                if (adjacencyX < 0 || adjacencyY < 0 || adjacencyX >= row || adjacencyY >= col) continue;
                if (visited[adjacencyX][adjacencyY] || farm[adjacencyX][adjacencyY] == -1) continue;
                queue.offer(new int[]{adjacencyX, adjacencyY});
                visited[adjacencyX][adjacencyY] = true;
                farm[adjacencyX][adjacencyY] = farm[currentX][currentY] + 1;
                lastVertex[0] = adjacencyX;
                lastVertex[1] = adjacencyY;
            }
        }
        return (farm[lastVertex[0]][lastVertex[1]] -1);
    }

    private static boolean isAllZero() {
        for (int i = 0; i < row; i++) {
            for (int j =0; j < col; j++) {
                if (farm[i][j] == 0) return false;
            }
        }
        return true;
    }
}
