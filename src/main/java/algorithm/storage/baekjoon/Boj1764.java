package algorithm.storage.baekjoon;

import java.util.Scanner;

public class Boj1764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        String noListen[] = new String[N];
        for(int i = 0; i < N; i++) {
            noListen[i] = sc.nextLine();
        }

        for (int i = 0; i < N; i++) {
            System.out.println(noListen[i]);
        }

        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < M; i++) {
            if (i == 0 || i == 1) continue;
            String cod = sc.nextLine();
            for (int j = 0; j < N; j++) {
                if (noListen[j].equals(cod)) {
                    sb.append(cod + "\n");
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println(sb);

    }
}
