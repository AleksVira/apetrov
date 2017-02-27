package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Tests for Counter.
 *
 * @author apetrov
 * @since 24.02.2017
 * @version 1
 */

public class CounterTest {

    /**
     * Проверка когда верхняя граница меньше нижней.
	 * Должен вернуть -1.
     */
    @Test
    public void whenUpperLimitBelowLower() {
		Counter counter = new Counter();
        assertThat(counter.add(11, 5), is(-1));
	}

    /**
     * Проверка когда верхняя граница меньше нижней.
	 * Должен вернуть 0.
     */
    @Test
    public void whenLimitsAreEqual() {
		Counter counter = new Counter();
        assertThat(counter.add(7, 7), is(0));
	}

    /**
     * Обычная проверка: когда нижняя граница меньше верхней.
     */
    @Test
    public void shouldReturnSumOfEvenNumbers() {
		Counter counter = new Counter();
        assertThat(counter.add(2, 10), is(30));
	}
}