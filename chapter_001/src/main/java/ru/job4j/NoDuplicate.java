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
     * All duplicates are erased and moved to the end of the array, then the tail is cut off.
     *
     * @param inArray -- source array
     * @return outArray -- array after cleaning
     */
    public String[] duplicatesRemove(String[] inArray) {
        if (inArray.length < 2) {
            return inArray;
        }
        String[] tmpArray = Arrays.copyOf(inArray, inArray.length);

        // Step 1: erase duplicate.

        int foundCounter = 0;
        for (int i = 0; i < tmpArray.length - 1; i++) {
            for (int j = i + 1; j < tmpArray.length; j++) {
                if (tmpArray[i] != null && tmpArray[i].equals(tmpArray[j])) {
                    tmpArray[j] = null;
                    foundCounter++;
                }
            }
        }

        // Step 2: move all nulls to the end.

        for (int i = 0; i < tmpArray.length - 1; i++) {
            if (tmpArray[i] == null) {
                for (int j = i + 1; j < tmpArray.length; j++) {
                    if (tmpArray[j] != null) {
                        tmpArray[i] = tmpArray[j];
                        tmpArray[j] = null;
                        break;
                    }
                }
            }
        }

        return Arrays.copyOf(tmpArray, tmpArray.length - foundCounter);
    }
}