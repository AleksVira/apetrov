package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Tests for SortedArraysJoin class.
 *
 * @author apetrov
 * @since 13.03.2017
 * @version 1
 */

public class SortedArraysJoinTest {

    /**
     * First test.
     */
    @Test
    public void wnenArrayVerySmallAndSimple() {
		SortedArraysJoin saj = new SortedArraysJoin();
		int[] expectArray = {1, 2, 3, 4};
		assertThat(saj.arrayJoin(new int[] {1, 2}, new int[] {3, 4}), is(expectArray));
	}

    /**
     * Second test.
     */
    @Test
    public void wnenArrayNotSimple() {
		SortedArraysJoin saj = new SortedArraysJoin();
		int[] expectArray = {1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 12, 14};
		assertThat(saj.arrayJoin(new int[] {1, 3, 5, 7, 8, 9}, new int[] {2, 4, 6, 8, 12, 14}), is(expectArray));
	}

}