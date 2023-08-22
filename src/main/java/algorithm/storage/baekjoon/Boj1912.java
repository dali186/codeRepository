package algorithm.storage.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1912 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int ary[] = new int[N];
        int res[] = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++) {
            ary[i] = Integer.parseInt(st.nextToken());
        }

        res[0] = ary[0];
        int max = ary[0];

        for(int i = 1; i < N; i++) {
            res[i] = Math.max(res[i-1] + ary[i], ary[i]);
            max = Math.max(res[i], max);
        }
        System.out.println(max);
    }

}
