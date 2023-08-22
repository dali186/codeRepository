package algorithm.storage.baekjoon;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Boj10816 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < N; i++) {
            int key = sc.nextInt();
            hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
        }
        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++) {
            int key = sc.nextInt();
            sb.append(hashMap.getOrDefault(key, 0) + " ");
        }
        System.out.println(sb);
    }
}


