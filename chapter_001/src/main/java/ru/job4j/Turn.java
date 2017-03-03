package ru.job4j;

/**
 * Class Turn, task "5.0 Перевернуть массив ".
 *
 * @author apetrov
 * @version 1
 * @since 01.03.2017
 */
public class Turn {
    /**
     * Constructor of array.
     * @param testArray -- array of integer numbers.
     */
    public Turn(int[] testArray) {
        this.testArray = testArray;
    }

    /**
     * Getter for testArray.
     * @return testArray
     */
    public int[] getTestArray() {
        return testArray;
    }

    /**
     * Array of int numbers.
     */
    private int[] testArray;

    /**
     * Make reverse array.
     */
    public void back() {
        for (int i = 0; i < testArray.length / 2; i++) {
            int tmp = testArray[i];
            testArray[i] = testArray[testArray.length - i - 1];
            testArray[testArray.length - i - 1] = tmp;
        }
    }
}
