package storage.baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Boj1654 {
    static int index = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int N = sc.nextInt();
        Integer lines[] = new Integer[n];
        for(int i = 0; i < n; i++) {
            lines[i] = sc.nextInt();
        }
        Arrays.sort(lines, Comparator.reverseOrder());
        System.out.println(maxLength(lines, 0, lines[lines.length-1], N));
    }


    public static int maxLength(Integer[] lines, int left, int right, int N) {
        if(left > right) {
            return -1;
        }
        int mid = (left + right)/2;
        System.out.println(index++ + "번째 mid : " + mid);

        if(cutLines(lines, mid) == N) {
            return mid;
        } else if (cutLines(lines, mid) < N) {
            return maxLength(lines, left, mid, N);
        } else {
            return maxLength(lines, mid, right, N);
        }
    }

    public static int cutLines(Integer[] lines, int length) {
        int sum = 0;
        for(int i = 0; i < lines.length; i++) {
            sum += lines[i] / length;
        }
        return sum;
    }
}
