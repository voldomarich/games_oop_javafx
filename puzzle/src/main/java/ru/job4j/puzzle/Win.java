package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] table) {
        boolean rsl = true;
        for (int row = 0; row < table.length; row++) {
            for (int cell = 0; cell < table[row].length; cell++) {
                int val = table[row][cell];
                if (val == 0) {
                    rsl = false;
                    break;
                }
            }
        }
        return rsl;
    }

    public static boolean check1(int[][] table) {
        boolean result = true;
        for (int cell = 0; cell < table.length; cell++) {
            for (int row = 0; row < table[cell].length; row++) {
                int val = table[row][cell];
                if (val == 0) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
