package storage.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj10828 {
    static int stack[];
    static int index = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        stack = new int[N];
        for (int i = 0; i < N; i++) {
            String command = br.readLine();
            if (command.equals("pop")) {
                pop();
            } else if (command.equals("size")) {
                size();
            } else if (command.equals("empty")) {
                empty();
            } else if (command.equals("top")) {
                top();
            } else {
                StringTokenizer st = new StringTokenizer(command, " ");
                if (st.nextToken().equals("push")) {
                    int num = Integer.parseInt(st.nextToken());
                    push(num);
                }
            }
        }
    }

    public static void push(int num) {
        stack[index] = num;
        index++;
    }

    public static void pop() {
        if(index == 0){
            System.out.println(-1);
            return;
        }
        System.out.println(stack[index-1]);
        index--;
    }

    public static void size() {
        System.out.println(index);
    }

    public static void empty() {
        if (index == 0) {
            System.out.println(1);
            return;
        }
        System.out.println(0);
    }

    public static void top() {
        if(index == 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(stack[index-1]);
    }
}
