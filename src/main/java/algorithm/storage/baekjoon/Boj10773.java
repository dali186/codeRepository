package algorithm.storage.baekjoon;

import java.io.*;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Boj10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) stack.pop();
            else stack.push(num);
        }

        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }

        bw.write(Integer.toString(sum));

        br.close();
        bw.close();
    }
}
