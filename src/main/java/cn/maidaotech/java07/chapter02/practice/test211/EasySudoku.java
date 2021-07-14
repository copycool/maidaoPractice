package cn.maidaotech.java07.chapter02.practice.test211;

public class EasySudoku {
    public static void play(int[] chessboard) {
        int[] exists = new int[9];
        for (int cell : chessboard) {
            if (cell != 0)
                exists[cell - 1] = 1;
        }
        for (int i = 0; i < exists.length; i++) {
            for (int j = 1; j < 10; j++) {
                // 说明这个位置可以填这个棋子
                if (chessboard[i] == 0 && exists[j - 1] == 0) {
                    chessboard[i] = j;
                    exists[j - 1] = 1;
                    break;
                }
            }
        }
        printArray(chessboard);
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