package storage.baekjoon;

import java.io.*;
import java.util.Stack;

public class Boj9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = 0;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String brackets = br.readLine();
            if (isVPS(brackets)) bw.write("YES");
            else bw.write("NO");
        }

        br.close();
        bw.close();
    }

    public static boolean isVPS(String brackets) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < brackets.length(); i++) {
            if (brackets.charAt(i) == '(') stack.push('(');
            else {
                if (brackets.charAt(i - 1) == '(') stack.pop();
                else stack.push(')');
            }
        }
        if (stack.isEmpty()) return true;
        else return false;
    }
}
