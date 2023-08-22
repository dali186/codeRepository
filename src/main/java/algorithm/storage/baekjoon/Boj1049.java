package storage.baekjoon;

import java.util.Scanner;

public class Boj1049 {
    static int packMin = 1000; //팩의 최소값
    static int pieceMin = 1000;     //낱개 최소값

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   //끊어진 기타줄의 개수
        int M = sc.nextInt();   //브랜드 개수

        for (int i = 0; i < M; i++) {
            int pack = sc.nextInt();
            packMin = pack < packMin ? pack : packMin;
            int piece = sc.nextInt();
            pieceMin = piece < pieceMin ? piece : pieceMin;
        }
        int resultPack, resultPiece, resultHybrid;
        //case 1. 팩으로 다 사는게 최소일때
        if (N % 6 != 0) {
            resultPack = (N/6+1) * packMin;
        } else {
            resultPack = N * packMin;
        }
        //case 2. 낱개로 다 사는게 최소일때
        resultPiece = pieceMin * N;
        //case3. 하이브리드가 최소일때
        resultHybrid = (N/6) * packMin + (N - ((N/6)*6)) * pieceMin;
        //System.out.println("팩으로 다 살 때 : " + resultPack + "\n낱개로 다 살 때 : " + resultPiece + "\n하이브리드 : " + resultHybrid);
        int result = resultPack > resultPiece ? (resultHybrid > resultPiece ? resultPiece : resultHybrid) : (resultHybrid > resultPack ? resultPack : resultHybrid);
        System.out.println(result);
    }
}
