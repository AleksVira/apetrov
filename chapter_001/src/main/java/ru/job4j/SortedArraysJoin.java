package ru.job4j;

/**
 * Class SortedArraysJoin, тестовая задача на объединение двух сортированных массивов.
 *
 * @author apetrov
 * @version 1
 * @since 13.03.2017
 */
public class SortedArraysJoin {
    /**
     * Combining two sorted arrays into one.
     * Returns new array.
     *
     * @param firstArray  -- source array # 1
     * @param secondArray -- source array # 2
     * @return joinedArray -- new sorted array.
     */
    public int[] arrayJoin(int[] firstArray, int[] secondArray) {
        int pointerFirst = 0;
        int pointerSecond = 0;
        int pointerJoin = 0;
        int[] joinedArray = new int[firstArray.length + secondArray.length];
        while (pointerFirst < firstArray.length && pointerSecond < secondArray.length) {
            joinedArray[pointerJoin++] = firstArray[pointerFirst] < secondArray[pointerSecond]
										 ? firstArray[pointerFirst++] : secondArray[pointerSecond++];
        }

        while (pointerFirst < firstArray.length) {
            joinedArray[pointerJoin++] = firstArray[pointerFirst++];
		}

        while (pointerSecond < secondArray.length) {
            joinedArray[pointerJoin++] = secondArray[pointerSecond++];
		}

        return joinedArray;
    }
}