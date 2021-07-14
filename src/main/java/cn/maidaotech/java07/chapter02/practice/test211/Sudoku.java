package cn.maidaotech.java07.chapter02.practice.test211;

public class Sudoku {
    static int[][] matrix = { { 0, 0, 4, 6, 0, 2, 0, 0, 0 }, { 6, 0, 0, 0, 3, 0, 0, 0, 4 },
            { 0, 2, 0, 4, 0, 0, 0, 9, 0 }, { 9, 8, 0, 0, 0, 0, 3, 5, 0 }, { 1, 0, 3, 0, 0, 0, 0, 4, 0 },
            { 0, 6, 0, 0, 0, 0, 8, 0, 7 }, { 0, 3, 0, 0, 2, 0, 0, 7, 0 }, { 0, 0, 0, 0, 6, 1, 0, 0, 5 },
            { 0, 0, 9, 3, 0, 0, 4, 0, 0 } };

    public static void main(String[] args) {
        sudokuSolve(0, 0);
    }

    public static void sudokuSolve(int curRow, int curCol) {
        if (curRow == 8 && curCol == 9) {
            for (int k = 0; k < 9; k++) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int t = 0; t < 9; t++) {
                    stringBuilder.append(matrix[k][t]);
                }
                System.out.println(stringBuilder.toString());
            }
            return;
        }
        if (curCol == 9) {
            curRow++;
            curCol = 0;
        }
        if (matrix[curRow][curCol] == 0) {
            for (int t = 1; t <= 9; t++) {
                if (check(curRow, curCol, t)) {
                    matrix[curRow][curCol] = t;
                    sudokuSolve(curRow, curCol + 1);
                    matrix[curRow][curCol] = 0;
                }
            }
        } else {
            sudokuSolve(curRow, curCol + 1);
        }

    }

    private static boolean check(int row, int col, int num) {
        // 1. 判断当前行或列是否有重复数字
        for (int i = 0; i < 9; i++) {
            if (matrix[row][i] == num) {
                return false;
            }
            if (matrix[i][col] == num) {
                return false;
            }
        }
        // 2. 判断小九宫格是否有重复数字
        int cellRow = row / 3;
        int cellCol = col / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[cellRow * 3 + i][cellCol * 3 + j] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}