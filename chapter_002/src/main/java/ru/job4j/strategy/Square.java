package ru.job4j.strategy;

/**
 * Класс Square.
 *
 * @author apetrov
 * @version 1
 * @since 06.04.2017
 */
public class Square implements Shape {

    /**
     * Реализация для квадрата.
     *
     * @return  фигура "квадрат".
     */
    public String pic() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append("*****");
            sb.append(System.getProperty("line.separator"));
        }
        return sb.toString();
    }
}
