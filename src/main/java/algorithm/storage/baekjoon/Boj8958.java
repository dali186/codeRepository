package algorithm.storage.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            String line = br.readLine();
            int result = 0;
            int cnt = 0;
            for(int j = 0; j < line.length(); j++) {
                if(line.charAt(j) == 'O') {
                    cnt++;
                    result += cnt;
                } else {
                    cnt = 0;
                }
            }
            System.out.println(result);
        }

    }
}
