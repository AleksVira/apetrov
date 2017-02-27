package ru.job4j;

/**
 * Class Paint, task "4.3. Построить пирамиду в псевдографике".
 *
 * @author apetrov
 * @version 1
 * @since 27.02.2017
 */
public class Paint {
    /**
     * Builds a pyramid from "^" and " ".
     * @param h		height of the pyramid
     * @return		pyramid picture
     */
    public String piramid(int h) {
        StringBuilder result = new StringBuilder();
        result.append(basement(h)).append("^").append("\n");
        if (h < 1) {
            return "";
        } else {
            for (int i = 1; i < h; i++) {
                result = result.append(basement(h - i)).append("^").append(basement(2 * i)).
								append("^").append("\n");
            }
        }
        return result.toString();
    }

    /**
     * Creates a string of "i" spaces.
     * @param i		number of spaces
     * @return		string i * " "
     */
    private String basement(int i) {
        StringBuilder newBase = new StringBuilder();
        for (int j = 1; j < i; j++) {
            newBase.append(" ");
        }
        return newBase.toString();
    }
}
