package storage.baekjoon;

import java.util.Scanner;

public class Boj2675 {
    //문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
    //즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다.
    //S에는 QR Code "alphanumeric" 문자만 들어있다
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0 ; i < T; i++) {
            int r = sc.nextInt();
            String s = sc.next();
            String answer = "";
            for(int j = 0; j < s.length(); j++) {
                for(int k = 0; k < r; k++) {
                    answer += s.charAt(j);
                }
            }
            System.out.println(answer);
        }
    }
}


//nextLine() - 한 줄 단위로 입력
//next() - 공백 전 까지의 문자열/ 개행 문자를 가져오지 않는다
//nextLine()이 안되는 이유
//nextInt() 사용 후 에 버퍼에 개행문자(\n)이 남아있기 때문에
//nextLine()은 \n을 인식해버린다.
//해결책 next()를 사용하던가, 버퍼를 초기화 해주던가
