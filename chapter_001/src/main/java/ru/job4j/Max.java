package ru.job4j;

/**
 * Class Max, задача "3.1. Максимум из двух чисел".
 * @author apetrov
 * @since 21.02.2017
 * @version 1
 */
public class Max {

	/**
     * Максимум из двух целых чисел.
	 * Если числа равные, возвращает первое число.
     * @param first - первое сравниваемое.
     * @param second - второе сравниваемое.
	 * @return Наибольшее из двух чисел
     */
	public int max(int first, int second) {
		return (first >= second) ? first : second;
	}
}