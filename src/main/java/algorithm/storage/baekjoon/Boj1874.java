package storage.baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Boj1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int array[] = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int index = 0;  //배열의 정보
        int num = 1;    //오름차순 수열
        while (index < N) {
            if (stack.isEmpty() || stack.peek() != array[index]) {
                stack.push(num);
                sb.append("+\n");
                num++;
            } else {
                stack.pop();
                sb.append("-\n");
                index++;
            }
            if (num > N + 1) {
                sb.delete(0, sb.length());
                sb.append("NO");
                break;
            }
        }
        System.out.println(sb);
    }
}
