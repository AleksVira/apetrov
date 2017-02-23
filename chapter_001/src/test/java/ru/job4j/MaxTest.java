package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Tests for Max.
 *
 * @author apetrov
 * @since 21.02.2017
 * @version 1
 */

public class MaxTest {

    /**
     * Test when the first argument is greater than the second.
	 * Both numbers is greater than zero.
     */
    @Test
    public void shouldReturnFirstArgumentOfTwoPositive() {
		Max maxTest = new Max();
        assertThat(maxTest.max(5, 3), is(5));
	}

    /**
     * Test when the first argument is greater than the second.
	 * Both numbers is below zero.
     */
    @Test
    public void shouldReturnFirstArgumentOfTwoNegative() {
		Max maxTest = new Max();
        assertThat(maxTest.max(-3, -8), is(-3));
	}

    /**
     * Test when the first argument is smaller than the second.
	 * Both numbers is greater than zero.
     */
    @Test
    public void shouldReturnSecondArgumentOfTwoPositive() {
		Max maxTest = new Max();
        assertThat(maxTest.max(3, 7), is(7));
	}

    /**
     * Test when the first argument is smaller than the second.
	 * Both numbers is below zero.
     */
    @Test
    public void shouldReturnSecondArgumentOfTwoNegative() {
		Max maxTest = new Max();
        assertThat(maxTest.max(-15, -4), is(-4));
	}

    /**
     * Test when the both arguments are equal.
     */
    @Test
    public void shouldReturnFirstOfEqual() {
		Max maxTest = new Max();
        assertThat(maxTest.max(7, 7), is(7));
	}

    /**
     * Test max function in case three arguments.
     */
    @Test
    public void shouldReturnMaximumOfThreeArguments() {
		Max maxTest = new Max();
        assertThat(maxTest.max(3, 7, 15), is(15));
	}

}