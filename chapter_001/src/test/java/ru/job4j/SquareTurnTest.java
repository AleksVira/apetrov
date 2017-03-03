package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Tests for Bubble class.
 *
 * @author apetrov
 * @since 02.03.2017
 * @version 1
 */

public class SquareTurnTest {

    /**
     * Check when size of array is 0.
     */
    @Test
    public void wnenSizeIsZero() {
		SquareTurn squareTurn = new SquareTurn(new int[0][0]);
		squareTurn.turnSquareArray();
		int[][] expectArray = {};
		assertThat(squareTurn.getValues(), is(expectArray));
	}

    /**
     * Check when non empty array, size even.
     */
    @Test
    public void whenSizeEven() {
		SquareTurn squareTurn = new SquareTurn(new int[][]{{1, 1, 1, 1}, {2, 2, 2, 2},
                                                           {3, 3, 3, 3}, {4, 4, 4, 4}});
		squareTurn.turnSquareArray();
		int[][] expectArray = {{4, 3, 2, 1}, {4, 3, 2, 1}, {4, 3, 2, 1}, {4, 3, 2, 1}};
		assertThat(squareTurn.getValues(), is(expectArray));
	}

    /**
     * Check when non empty array, size odd.
     */
    @Test
    public void whenSizeOdd() {
		SquareTurn squareTurn = new SquareTurn(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
		squareTurn.turnSquareArray();
		int[][] expectArray = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
		assertThat(squareTurn.getValues(), is(expectArray));
	}
}