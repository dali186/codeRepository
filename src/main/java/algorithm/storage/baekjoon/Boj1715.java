package storage.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Boj1715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int result = 0;

        for(int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j <= i + 1; j++) {
                sum += arr[j];
            }
            result += sum;
        }
        System.out.println(result);
    }
}
