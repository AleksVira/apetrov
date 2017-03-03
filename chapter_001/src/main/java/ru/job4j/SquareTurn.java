package ru.job4j;

/**
 * Class Turn, task "5.1. Создать программу для сортировки массива методом перестановки".
 *
 * @author apetrov
 * @version 1
 * @since 02.03.2017
 */
public class SquareTurn {
    /**
     * Constructor of class with two-dimensional array.
     *
     * @param newValues -- two-dimensional array of integer numbers.
     */
    public SquareTurn(int[][] newValues) {
        this.values = newValues;
    }

    /**
     * Two-dimensional array of integers.
     */
    private int[][] values;

    /**
     * Getter for values.
     *
     * @return values
     */
    public int[][] getValues() {
        return values;
    }

    /**
     * Rotate clockwise two-dimensional array.
     */
    public void turnSquareArray() {
        int size = values.length;
        for (int i = 0; i < size / 2; i++) {
            for (int j = i; j < size - 1 - i; j++) {
                int tmp = values[i][j];
                values[i][j] = values[size - j - 1][i];
                values[size - j - 1][i] = values[size - i - 1][size - j - 1];
                values[size - i - 1][size - j - 1] = values[j][size - i - 1];
                values[j][size - i - 1] = tmp;
            }
        }
    }
}
