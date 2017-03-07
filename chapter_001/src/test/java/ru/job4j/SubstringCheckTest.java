package ru.job4j;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Tests for Bubble class.
 *
 * @author apetrov
 * @since 07.03.2017
 * @version 1
 */

public class SubstringCheckTest {

    /**
     * Simple check, only two letters.
     */
    @Test
    public void wnenSubIsSmallAndTrue() {
		SubstringCheck substringCheck = new SubstringCheck();
		boolean result = substringCheck.subCheck("DE", "ABCDEFDE");
		assertEquals(result, true);
	}

    /**
     * Second simple check, only two letters.
     */
    @Test
    public void wnenSubIsSmallAndFalse() {
		SubstringCheck substringCheck = new SubstringCheck();
		boolean result = substringCheck.subCheck("AA", "ABCDEFDE");
		assertEquals(result, false);
	}

    /**
     * More complicated test, longer strings.
     */
    @Test
    public void secondCheck() {
		SubstringCheck substringCheck = new SubstringCheck();
		boolean result = substringCheck.subCheck("DEDFDD", "ABCDEFDEDFDD1234");
		assertEquals(result, true);
	}
}