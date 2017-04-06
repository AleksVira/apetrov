package ru.job4j.strategy;

/**
 * Класс Paint -- задача части 02, урок 5.
 *
 * @author apetrov
 * @version 1
 * @since 06.04.2017
 */
public class Paint {
    /**
     * Рисует фигуру в консоли.
     *
     * @param shape конкретная фигура.
     */
    public void draw(Shape shape) {
        shape.pic();
    }

}
