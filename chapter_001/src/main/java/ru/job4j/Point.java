package ru.job4j;

/**
 * Class Point, задача "3.2. Создать программу вычисления площади треугольника".
 * @author apetrov
 * @since 21.02.2017
 * @version 1
 */
public class Point {

	/** X-координата. */
	private double x;
	/** Y-координата. */
	private double y;

	/** Конструктор объекта.
	 * @param x - координата по оси X
	 * @param y - координата по оси Y
	 */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
     * Расстояние от объекта этого класса до другого объекта класса Point.
     * @param point - передаваемая точка.
	 * @return расстояние между точками.
     */
	public double distanceTo(Point point) {
		return Math.sqrt((this.x - point.x) * (this.x - point.x) + (this.y - point.y) * (this.y - point.y));
	}

}