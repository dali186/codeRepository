package algorithm.storage.baekjoon;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Boj16435 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int birdLength = sc.nextInt();

        int food[] = new int[N];
        for (int i = 0; i < N; i++) {
            food[i] = sc.nextInt();
        }

        Arrays.sort(food);
        for (int i = 0; i < N; i++) {
            if (birdLength >= food[i]) {
                birdLength++;
            }
        }
        System.out.println(birdLength);
    }
}
