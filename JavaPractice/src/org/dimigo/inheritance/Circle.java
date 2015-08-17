package org.dimigo.inheritance;

public class Circle extends Figure {
	public int radius;

	public Circle(int centerX, int centerY, int radius) {
		super(centerX, centerY, "원");
		this.radius = radius;
	}
	public Circle(int radius) {
		super(0, 0, "원");
		this.radius = radius;
	}


	protected double calcArea()
	{
		return radius*radius*Math.PI;
	}
}
