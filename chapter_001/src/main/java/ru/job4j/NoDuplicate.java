package ru.job4j;

import java.util.Arrays;

/**
 * Class NoDuplicate, task "5.3. Удаление дубликатов в массиве".
 *
 * @author apetrov
 * @version 1
 * @since 03.03.2017
 */
public class NoDuplicate {
    /**
     * Remove duplicates from array.
     * All duplicates are moved to the end of the array, then the tail is cut off.
     *
     * @param inArray -- source array
     * @return outArray -- array after cleaning
     */
    public String[] duplicatesRemove(String[] inArray) {
        if (inArray.length < 2) {
            return inArray;
        }
        String[] tmpArray = Arrays.copyOf(inArray, inArray.length);
        int pointer = tmpArray.length;
        for (int i = 0; i < pointer; i++) {
            for (int j = i + 1; j < pointer; j++) {
                if (tmpArray[i].equals(tmpArray[j])) {
                    tmpArray[j] = tmpArray[pointer - 1];
                    pointer--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(tmpArray, pointer);
    }
}