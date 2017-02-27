package ru.job4j;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Tests for Paint class.
 *
 * @author apetrov
 * @since 27.02.2017
 * @version 1
 */

public class PaintTest {

    /**
     * Check when height is less than 1.
	 * Should return "".
     */
    @Test
    public void whenHeightLessOne() {
		Paint paint = new Paint();
		assertEquals(paint.piramid(0), "");
	}

    /**
     * Check when height is equal 1.
	 * Should return "^".
     */
    @Test
    public void whenHeightEqualOne() {
		Paint paint = new Paint();
		assertEquals(paint.piramid(1), "^\n");
	}

    /**
     * Check when height is greater than 1.
	 * Should return pyramid of "^".
     */
    @Test
    public void whenHeightGreaterOne() {
		Paint paint = new Paint();
		assertEquals(paint.piramid(4), "   ^\n  ^ ^\n ^   ^\n^     ^\n");
	}
}