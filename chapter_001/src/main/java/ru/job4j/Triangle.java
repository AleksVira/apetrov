package ru.job4j;

/**
 * Class Triangle, задача "3.2. Создать программу вычисления площади треугольника".
 * @author apetrov
 * @since 21.02.2017
 * @version 1
 */
public class Triangle {
	/** Первая точка треугольника. */
	private Point a;
	/** Вторая точка треугольника. */
	private Point b;
	/** Третья точка треугольника. */
	private Point c;

	/** Создает объект Triangle.
	 * @param a - первая точка
	 * @param b - вторая точка
	 * @param c - третья точка
	 */
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
     * Площадь треугольника по трём точкам.
	 * @return площадь, если треугольник существует, и 0, если такой треугольник существовать не может.
     */
	public double area() {
		double result = 0.0;
		double distanceAB = this.a.distanceTo(b);
		double distanceBC = this.b.distanceTo(c);
		double distanceCA = this.c.distanceTo(a);
		double halfPerimeter = (distanceAB + distanceBC + distanceCA) / 2;
		if (((distanceAB + distanceBC) > distanceCA) && ((distanceBC + distanceCA) > distanceAB) && ((distanceCA + distanceAB) > distanceBC)) {
			result = Math.sqrt(halfPerimeter * (halfPerimeter - distanceAB) * (halfPerimeter - distanceBC) * (halfPerimeter - distanceCA));
		} else {
			result = 0.0;
		}
		return result;
	}
}