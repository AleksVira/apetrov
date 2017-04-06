package ru.job4j.strategy;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест класса Triangle.
 *
 * @author apetrov
 * @version 1
 * @since 05.04.2017
 */
public class TriangleTest {

    /** Тест создания треугольника. */
    @Test
    public void testPic() {
        Triangle triangle = new Triangle();
        String result = triangle.pic();
        String expectedFigure = "   *   \r\n  ***  \r\n ***** \r\n*******\r\n";
        assertThat(result, is(expectedFigure));
    }
}
