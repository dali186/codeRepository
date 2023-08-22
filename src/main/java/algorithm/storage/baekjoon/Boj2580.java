package storage.baekjoon;

import JavaGrammar.Generic.Powder;

import java.util.Scanner;

public class Boj2580 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sudoku[][] = new int[9][9];
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                sudoku[i][j] = sc.nextInt();
            }
        }

    }
}
