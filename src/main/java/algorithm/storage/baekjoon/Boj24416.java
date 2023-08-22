package storage.baekjoon;

import java.util.Scanner;

public class Boj24416 {
    static int a = 0;
    static int b = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        fibonacci_recursion(N);
        fibonacci(N);
        System.out.println(a + " " + b);
    }

    public static int fibonacci_recursion(int n) {
        if(n == 1 || n == 2) {
            a++;
            return 1;
        } else {
            return (fibonacci_recursion(n-1) + fibonacci_recursion(n - 2));
        }
    }

    public static int fibonacci(int n) {
        int[] fib = new int[n+1];

        fib[1]=1;
        fib[2]=1;

        for (int i = 3; i <= n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
            b++;
        }
        return fib[n];
    }
}
