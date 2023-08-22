
package storage.baekjoon;

import java.util.Scanner;

public class Boj1300 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long M = sc.nextInt();

        long a = M/N + 1;
        long b = M%N + 1;
        long value = a * b;

        System.out.println(value);
    }
}
