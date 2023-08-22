package algorithm.storage.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Boj5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        //테스트 케이스 만큼 반복
        for (int i = 0; i < T; i++) {
            //배열 출력 순서
            boolean isReverse = false;
            //명령어 입력 값
            String commands = br.readLine();
            int arrayLength = Integer.parseInt(br.readLine());
            //덱 생성 후 배열값 받아서 삽입
            Deque<Integer> deque = new ArrayDeque<>();
            String arrayString = br.readLine();
            addElements(deque, arrayString);
            //명령어 처리
            try {
                for (int j = 0; j < commands.length(); j++) {
                    char command = commands.charAt(j);
                    if (command == 'R') {
                        isReverse = !isReverse;
                        continue;
                    } else if (command == 'D') {
                        //비었는지 확인
                        if (deque.isEmpty()) throw new NullPointerException();
                        //뒤집혔을 때 - 뒤에서 부터 제거, 그대로일 때 - 앞에서 부터 제거
                        if (isReverse) deque.removeLast();
                        else deque.removeFirst();
                    }
                }
                //출력
                printDeque(deque, isReverse);
            } catch (NullPointerException e) {
                System.out.println("error");
            }
        }
    }
    private static void printDeque(Deque<Integer> deque, boolean isReverse) {
        StringBuilder sb = new StringBuilder();
        //뒤집힌 대로 출력할 때, 그대로 출력할 때
        if (isReverse) {
            sb.append("[");
            for (int i = deque.size() - 1; i >= 0; i--) {
                sb.append(deque.removeLast());
                if (i != 0) sb.append(",");
            }
            sb.append("]");
        } else {
            sb.append("[");
            for (int i = deque.size() - 1; i >= 0; i--) {
                sb.append(deque.removeFirst());
                if (i != 0) sb.append(",");
            }
            sb.append("]");
        }
        System.out.println(sb);
    }

    private static void addElements(Deque<Integer> deque, String arrayString) {
        String noBrackets = arrayString.replaceAll("\\[|\\]", "");
        StringTokenizer st = new StringTokenizer(noBrackets, ",");
        while (st.hasMoreTokens()) {
            deque.add(Integer.parseInt(st.nextToken()));
        }
    }
}