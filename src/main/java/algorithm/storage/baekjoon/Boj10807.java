package storage.baekjoon;

import java.io.*;
import java.util.Arrays;


public class Boj10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] list = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int target = Integer.parseInt(br.readLine());
        int cnt = (int) Arrays.stream(list).filter(i -> i == target).count();
        bw.write(Integer.toString(cnt));

        br.close();
        bw.close();
    }
}
