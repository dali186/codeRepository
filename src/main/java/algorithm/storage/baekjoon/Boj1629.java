package algorithm.storage.baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Boj1629 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String T = sc.nextLine();
        StringTokenizer st = new StringTokenizer(T);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        double result = Math.pow(a,b) % c;
        System.out.println(result);
    }
}
