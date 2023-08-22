package algorithm.storage.baekjoon;


import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Boj18870 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ary[] = new int[N];
        for(int i = 0; i < N; i++) {
            ary[i] = sc.nextInt();
        }
        int clone[] = new int[N];
        clone = ary.clone();

        Arrays.sort(clone);

        int cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++) {
            if(!map.containsKey(clone[i])) {
                map.put(clone[i], cnt++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(map.get(ary[i]) + " ");
        }
        System.out.println(sb);

    }

}
