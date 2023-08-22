package algorithm.storage.baekjoon;

import org.w3c.dom.Node;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Boj18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        LinkedList<Integer> myQueue = new LinkedList<>();
        for (int i = 0; i < T; i++) {
            String line = br.readLine();
            if (line.equals("pop")) {
                if (myQueue.isEmpty()) {
                    System.out.println("-1");
                    continue;
                }
                System.out.println(myQueue.getFirst());} else if (line.equals("size")) {
                System.out.println(myQueue.size());
            } else if (line.equals("empty")) {
                if (myQueue.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (line.equals("front")) {
                if (myQueue.isEmpty()) {
                    System.out.println("-1");
                    continue;
                }
                System.out.println(myQueue.pollLast());
            } else if (line.equals("back")) {
                if (myQueue.isEmpty()) {
                    System.out.println("-1");
                    continue;
                }
                System.out.println(myQueue.pollFirst());
            } else {
                StringTokenizer st = new StringTokenizer(line, " ");
                st.nextToken();
                int pushNum = Integer.parseInt(st.nextToken());
                myQueue.push(pushNum);
            }
        }
    }
}
