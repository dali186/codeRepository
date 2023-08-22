package algorithm.deepdive.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//BFS, 바이러스
//https://www.acmicpc.net/problem/2606
public class Boj2606 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int computers = Integer.parseInt(reader.readLine());
        int networks = Integer.parseInt(reader.readLine());
        List<Integer>[] computerList = new ArrayList[computers + 1];
        for (int i = 1; i <= computers; i++) computerList[i] = new ArrayList<>();
        for (int i = 0; i < networks; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");
            int x = Integer.parseInt(tokenizer.nextToken());
            int y = Integer.parseInt(tokenizer.nextToken());
            computerList[x].add(y);
            computerList[y].add(x);
        }

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[computers + 1];
        queue.offer(1);
        visited[1] = true;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int com : computerList[cur]) {
                if (!visited[com]) {
                    queue.offer(com);
                    visited[com] = true;
                }
            }
        }
        int cnt = 0;
        for (int i = 1; i < visited.length; i++) {
            if (visited[i]) cnt++;
        }
        System.out.println(cnt - 1);
    }
}
