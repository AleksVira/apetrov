package ru.job4j;

/**
 * Class SubstringCheck, task "Часть 01. Тестовое задание".
 *
 * @author apetrov
 * @version 1
 * @since 07.03.2017
 */
public class SubstringCheck {
    /**
     * Check: substring is the part of another string.
     * Returns "true", if "sub" is a part of "origin" string.
     *
     * @param origin -- source array
     * @param sub    -- substring to check
	 * @return -- "true", if "sub" is a part of "origin" string.
     */
    public boolean subCheck(String sub, String origin) {
        String[] subArray = sub.split("");
        String[] originArray = origin.split("");
        int pointer = 0;
        while (pointer < (originArray.length - subArray.length + 1)) {
            if (originArray[pointer].equals(subArray[0])) {
                for (int i = 1; i < subArray.length; i++) {
                    if (!originArray[pointer + i].equals(subArray[i])) {
                        break;
                    }
                    if (i == (subArray.length - 1)) {
                        return true;
                    }
                }
            }
            pointer++;
        }
        return false;
    }
}