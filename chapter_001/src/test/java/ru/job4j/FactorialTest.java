package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.math.BigInteger;

/**
 * Tests for Factorial.
 *
 * @author apetrov
 * @since 27.02.2017
 * @version 1
 */

public class FactorialTest {

    /**
     * Check when number below zero.
	 * Should return 0.
     */
    @Test
    public void whenNumberBelowZero() {
		Factorial factorial = new Factorial();
        assertThat(factorial.calculateFactorial(-5), is(BigInteger.ZERO));
	}

    /**
     * Check when number is ZERO.
	 * Should return 1.
     */
    @Test
    public void whenNumberIsZero() {
		Factorial factorial = new Factorial();
        assertThat(factorial.calculateFactorial(0), is(BigInteger.ONE));
	}

    /**
     * Check when number is greater than zero.
	 * Should return factorial.
     */
    @Test
    public void whenNumberIsGreaterZero() {
		Factorial factorial = new Factorial();
        assertThat(factorial.calculateFactorial(5), is(BigInteger.valueOf(120)));
	}
}