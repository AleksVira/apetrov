package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Tests for Bubble class.
 *
 * @author apetrov
 * @since 01.03.2017
 * @version 1
 */

public class BubbleTest {

    /**
     * Check when size of array is 0.
     */
    @Test
    public void wnenSizeIsZero() {
		Bubble bubble = new Bubble(new int[0]);
		bubble.bubbleSort();
		int[] expectArray = {};
		assertThat(bubble.getValues(), is(expectArray));
	}

    /**
     * Check when non empty array, completely unsorted.
     */
    @Test
    public void whenCompletelyUnsorted() {
		Bubble bubble = new Bubble(new int[] {6, 5, 4, 3, 2, 1});
		bubble.bubbleSort();
		int[] expectArray = {1, 2, 3, 4, 5, 6};
		assertThat(bubble.getValues(), is(expectArray));
	}

    /**
     * Check when partly unsorted.
     */
    @Test
    public void whenPartlyUnsorted() {
		Bubble bubble = new Bubble(new int[] {1, 2, 5, 4, 3, 3});
		bubble.bubbleSort();
		int[] expectArray = {1, 2, 3, 3, 4, 5};
		assertThat(bubble.getValues(), is(expectArray));
	}
}