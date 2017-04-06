package ru.job4j.strategy;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест класса Square.
 *
 * @author apetrov
 * @version 1
 * @since 05.04.2017
 */
public class SquareTest {

    /** Тест создания квадрата. */
    @Test
    public void testPic() {
        Square square = new Square();
        String result = square.pic();
        String expectedFigure = "*****\r\n*****\r\n*****\r\n*****\r\n*****\r\n";
        assertThat(result, is(expectedFigure));
    }
}
