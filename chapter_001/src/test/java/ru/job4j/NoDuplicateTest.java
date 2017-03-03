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

public class NoDuplicateTest {

    /**
     * Check when size of array is less 2.
     */
    @Test
    public void wnenSizeIsBelowTwo() {
		NoDuplicate noDuplicate = new NoDuplicate();
		String[] result = noDuplicate.duplicatesRemove(new String[]{"AA"});
		String[] expectArray = {"AA"};
		assertThat(result, is(expectArray));
	}

    /**
     * Test with a small array.
     */
    @Test
    public void smallArrayTest() {
		NoDuplicate noDuplicate = new NoDuplicate();
		String[] result = noDuplicate.duplicatesRemove(new String[]{"AA", "BB", "AA", "AA"});
		String[] expectArray = {"AA", "BB"};
		assertThat(result, is(expectArray));
	}

    /**
     * Test with a little bit more complex array.
     */
    @Test
    public void biggerArrayTest() {
		NoDuplicate noDuplicate = new NoDuplicate();
		String[] result = noDuplicate.duplicatesRemove(new String[]{"FF", "AA", "EE", "AA", "EE", "AA", "BB", "CC", "CC", "DD"});
		String[] expectArray = {"FF", "AA", "EE", "BB", "CC", "DD"};
		assertThat(result, is(expectArray));
	}
}