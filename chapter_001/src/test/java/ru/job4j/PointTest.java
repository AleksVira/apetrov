package ru.job4j;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * Tests for Point.
 *
 * @author apetrov
 * @since 21.02.2017
 * @version 1
 */

public class PointTest {

	/** Точность тестирования. */
	private double accuracy = 0.0002;

    /**
     * Тестирует метод distanceTo.
     */
    @Test
    public void shouldReturnDistanceToArgument() {
		Point firstPoint = new Point(0.0, 0.0);
        assertThat(firstPoint.distanceTo(new Point(2.0, 2.0)), is(closeTo(2.828427124, accuracy)));
	}

}