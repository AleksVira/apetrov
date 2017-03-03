package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Tests for Turn class.
 *
 * @author apetrov
 * @since 01.03.2017
 * @version 1
 */

public class TurnTest {

    /**
     * Check when size of array is 0.
     */
    @Test
    public void wnenSizeIsZero() {
		Turn turn = new Turn(new int[0]);
		turn.back();
		int[] expectArray = {};
		assertThat(turn.getTestArray(), is(expectArray));
	}

    /**
     * Check when non empty array.
	 * Even number of cells.
     */
    @Test
    public void checkNonEmptyArrayEven() {
		Turn turn = new Turn(new int[] {1, 2, 3, 4, 5, 6});
		turn.back();
		int[] expectArray = {6, 5, 4, 3, 2, 1};
		assertThat(turn.getTestArray(), is(expectArray));
	}

    /**
     * Check when non empty array.
	 * Odd number of cells.
     */
    @Test
    public void checkNonEmptyArrayOdd() {
		Turn turn = new Turn(new int[] {1, 2, 3, 4, 5, 6, 7});
		turn.back();
		int[] expectArray = {7, 6, 5, 4, 3, 2, 1};
		assertThat(turn.getTestArray(), is(expectArray));
	}
}