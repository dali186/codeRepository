package algorithm.deepdive.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//BFS, 단지번호붙이기
//https://www.acmicpc.net/problem/2667
public class Boj2667 {
    static int N;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        N = Integer.parseInt(reader.readLine());
        visited = new boolean[N][N];
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            String line = reader.readLine();
            for (int j = 0; j < N; j++) {
                int result = Integer.parseInt(String.valueOf(line.charAt(j)));
                matrix[i][j] = result;
                if (result == 0) visited[i][j] = true;
            }
        }
        int cnt = 0;
        List<Integer> resultList = new ArrayList<>();
        while (stillCheck()[0] != -1 && stillCheck()[1] != -1) {
            int[] target = stillCheck();
            resultList.add(bfs(matrix, target[0], target[1]));
            cnt++;
        }
        Collections.sort(resultList);
        for (int result : resultList) builder.append(result + "\n");
        builder.insert(0, cnt + "\n");
        System.out.println(builder);
    }

    private static int bfs(int[][] graph, int x, int y) {
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{x,y});
        visited[x][y] = true;
        int cnt = 1;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentX = current[0];
            int currentY = current[1];

            for (int i = 0; i < 4; i++) {
                int adjacencyX = currentX + dx[i];
                int adjacencyY = currentY + dy[i];
                if (adjacencyX < 0 || adjacencyY < 0 || adjacencyX >= N || adjacencyY >= N) continue;
                if (visited[adjacencyX][adjacencyY] || graph[adjacencyX][adjacencyY] == 0) continue;
                queue.offer(new int[]{adjacencyX, adjacencyY});
                visited[adjacencyX][adjacencyY] = true;
                cnt++;
            }
        }
        return cnt;
    }

    private static int[] stillCheck() {
        int x = -1;
        int y = -1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    x = i;
                    y = j;
                }
            }
        }
        return new int[]{x,y};
    }


}
