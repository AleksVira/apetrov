package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Tests for Calculator.
 *
 * @author apetrov
 * @since 20.02.2017
 * @version 1
 */

public class CalculatorTest {

    /**
     * Test add.
     */
    @Test
    public void shouldReturnSumOfTwoArgumentsPassed() {
		Calculator calculator = new Calculator();
		calculator.add(1.5, 9.3);
        assertThat(calculator.getResult(), is(10.8));
	}

    /**
     * Test substruct.
     */
    @Test
    public void shouldReturnDifferenceBetwenOfTwoArgumentsPassed() {
		Calculator calculator = new Calculator();
		calculator.substruct(11.0, 6.5);
        assertThat(calculator.getResult(), is(4.5));
	}

    /**
     * Test multiple.
     */
    @Test
    public void shouldReturnResultOfMultiplication() {
		Calculator calculator = new Calculator();
		calculator.multiple(2.5, 3.0);
        assertThat(calculator.getResult(), is(7.5));
	}

    /**
     * Test div.
     */
    @Test
    public void shouldReturnResultOfDivision() {
		Calculator calculator = new Calculator();
		calculator.div(14.2, 7.1);
        assertThat(calculator.getResult(), is(2.0));
	}

}