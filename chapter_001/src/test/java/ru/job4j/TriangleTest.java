package ru.job4j;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * Tests for Triangle.
 *
 * @author apetrov
 * @since 21.02.2017
 * @version 1
 */

public class TriangleTest {

	/** Точность тестирования. */
	private double accuracy = 0.01;

    /**
     * Тестирует метод area, треугольник существует.
     */
    @Test
    public void shouldReturnArea() {
		Triangle triangle = new Triangle(new Point(1.0, 1.0), new Point(5.0, 2.0), new Point(2.0, 5.0));
        assertThat(triangle.area(), is(closeTo(7.4981, accuracy)));
	}

    /**
     * Тестирует метод area, треугольник существовать не может.
     */
    @Test
    public void shouldReturnZeroArea() {
		Triangle triangle = new Triangle(new Point(1.0, 1.0), new Point(3.0, 1.0), new Point(6.0, 1.0));
        assertThat(triangle.area(), is(closeTo(0.0, 0.0)));
	}
}