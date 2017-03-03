package ru.job4j;

/**
 * Class Turn, task "5.1. Создать программу для сортировки массива методом перестановки".
 *
 * @author apetrov
 * @version 1
 * @since 01.03.2017
 */
public class Bubble {
    /**
     * The class constructor with an array.
     *
     * @param newValues -- array of integer numbers.
     */
    public Bubble(int[] newValues) {
        this.values = newValues;
    }

    /**
     * Array of unsorted integers.
     */
    private int[] values;

    /**
     * Getter for values.
     *
     * @return values
     */
    public int[] getValues() {
        return values;
    }

    /**
     * Sort the array (Bubble sort).
     */
    public void bubbleSort() {
        for (int i = 0; i < values.length; i++) {
            boolean wasShifted = false;
            for (int j = 0; j < values.length - i - 1; j++) {
                if (values[j] > values[j + 1]) {
                    int tmp = values[j + 1];
                    values[j + 1] = values[j];
                    values[j] = tmp;
                    wasShifted = true;
                }
            }
            if (!wasShifted) {
                break;
            }
        }

    }
}
