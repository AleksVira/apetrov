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
     * Sort the array (Bubble sort).
     *
     * @param values -- array of integer numbers.
     * @return sorted array
     */
    public int[] bubbleSort(int[] values) {
        boolean wasSwapped = false;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length - 1 - i; j++) {
                if (values[j] > values[j + 1]) {
                    wasSwapped = true;
                    int tmp = values[j + 1];
                    values[j + 1] = values[j];
                    values[j] = tmp;
                }
            }
            if (!wasSwapped) {
                break;
            }
        }
        return values;
    }
}
