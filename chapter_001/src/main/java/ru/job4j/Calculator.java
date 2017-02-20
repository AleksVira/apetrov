package ru.job4j;

/**
 * Class Calculator, it simulates the operation of the calculator.
 * @author apetrov
 * @since 19.02.2017
 * @version 1
 */
public class Calculator {

	/** Result of calculation. */
	private double result;

	/**
	 * Getter for result.
     * @return	Calculation result
	 */
	public double getResult() {
		return result;
	}

	/**
     * Summation.
     * @param first - 1st summand
     * @param second - 2nd summand
     */
	public void add(double first, double second) {
		this.result = first + second;
	}

	/**
     * Subtraction.
     * @param first - minuend
     * @param second - subtrahend
     */
	public void substruct(double first, double second) {
		this.result = first - second;
	}

	/**
     * Division.
     * @param first - dividend
     * @param second - divisor
     */
	public void div(double first, double second) {
		if (second != 0) {
			this.result = first / second;
		} else {
			throw new ArithmeticException("Impossible to div by 0");
		}
	}

	/**
     * Multiplication.
     * @param first - multiplicand
     * @param second - multiplier
     */
	public void multiple(double first, double second) {
		this.result = first * second;
	}

}