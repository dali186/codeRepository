package storage.programmers;

import java.util.ArrayList;

public class CraneDoll {

    public static void main(String[] args) {
        int board[][] = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int moves[] = {1, 5, 3, 5, 1, 2, 1, 4};

        int answer = 0;
        ArrayList<Integer> picked = new ArrayList<>();

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

        for(int i = 0; i < moves.length; i++) {
            int index = moves[i] - 1;
            for(int j = 0; j < board.length; j++) {
                if(board[j][index] != 0) {
                    picked.add(board[j][index]);
                    board[j][index] = 0;
                    break;
                }
            }
        }
        for(int i = 1; i < picked.size(); i++) {
            if(picked.get(i) == picked.get(i-1)) {
                answer += 2;
                picked.remove(i);
                picked.remove(i-1);
                i = 0;
            }
        }
        System.out.println(answer);

    }

}
