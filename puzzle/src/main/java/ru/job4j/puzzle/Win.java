package ru.job4j.puzzle;

public class Win {
    public static boolean monoHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board[row].length; cell++) {
            int val = board[row][cell];
            if (val != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(int[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board[column].length; row++) {
            int val = board[row][column];
            if (val != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean check(int[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 1 && (monoHorizontal(board, index) ||
                    monoVertical(board, index))) {
                result = true;
                break;
            }
        }
        return result;
    }
}
