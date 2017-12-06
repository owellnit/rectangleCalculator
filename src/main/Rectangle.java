package main;

public class Rectangle {
	private Double sideA = 0.0;
	private Double sideB = 0.0;
	
	/**
	 * The constructor creates a rectangle.
	 * 
	 * @param a Length of side a.
	 * @param b Length of side b.
	 */
	public Rectangle (Double a, Double b) {
		sideA = a;
		sideB = b;
	}
	
	/**
	 * Calculates the area.
	 * 
	 * @return The area of the rectangle.
	 */
	public Double calculateArea() {
		return sideA * sideB;
	}
	
	/**
	 * Calculates the diagonal.
	 * 
	 * @return The diagonal of the rectangle.
	 */
	public Double calculateDiagonal() {
		return Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
	}
}
