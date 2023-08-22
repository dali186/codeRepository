package storage.baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Boj1152 {
    //영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까?
    //이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
    //단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
        int count = 0;
        while (st.hasMoreTokens()) {
            if(st.nextToken() != "") count++;
        }
        System.out.println(count);
    }
}
