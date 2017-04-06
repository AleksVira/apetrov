package ru.job4j.strategy;

/**
 * Класс Triangle -- рисуем треугольник.
 *
 * @author apetrov
 * @version 1
 * @since 06.04.2017
 */
public class Triangle implements Shape {

    /**
     * Реализация для треугольника.
     *
     * @return  фигура "треугольник".
     */
    public String pic() {
        String ls = System.getProperty("line.separator");
        StringBuilder sb = new StringBuilder();
        sb.append("   *   " + ls);
        sb.append("  ***  " + ls);
        sb.append(" ***** " + ls);
        sb.append("*******" + ls);
        return sb.toString();
    }
}
