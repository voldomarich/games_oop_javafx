package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board, int row) {
        boolean rsl = true;
            for (int cell = 0; cell < board[row].length; cell++) {
                int val = board[row][cell];
                if (val != 1) {
                    rsl = false;
                    break;
                }
            }
        return rsl;
    }

    public static boolean check1(int[][] board, int cell) {
        boolean result = true;
            for (int row = 0; row < board[cell].length; row++) {
                int val = board[row][cell];
                if (val != 1) {
                    result = false;
                    break;
                }
            }
        return result;
    }
}
