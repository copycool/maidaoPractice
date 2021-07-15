package cn.maidaotech.java07.chapter02.practice.test211;

public class EasySudoku {

    public static void play(int[] chessboard) {
        int[] exists = new int[9];
        for (int cell : chessboard) {
            if (cell != 0)
                exists[cell - 1] = 1;
        }
        helper(chessboard, exists, 0);
    }

    private static void helper(int[] chessboard, int[] exists, int curCol) {
        if (curCol == chessboard.length) {
            printArray(chessboard);
            return;
        }
        for (int num = 1; num < 10; num++) {
            // 说明这个位置可以填这个棋子
            if (chessboard[curCol] == 0) {
                if (exists[num - 1] == 0) {
                    chessboard[curCol] = num;
                    exists[num - 1] = 1;
                    helper(chessboard, exists, curCol + 1);
                    exists[num - 1] = 0;
                    chessboard[curCol] = 0;
                }
            } else {
                helper(chessboard, exists, curCol + 1);
            }
        }

    }

    private static void printArray(int[] arr) {
        StringBuilder arrStr = new StringBuilder();
        for (int i : arr) {
            arrStr.append(i);
            arrStr.append(" ");
        }
        System.out.println(arrStr.toString());
    }
}