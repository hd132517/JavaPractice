package org.dimigo.inheritance;

public class Rec extends Figure {
	public int width;
	public int height;
	
	public Rec(int centerX, int centerY, int width, int height) {
		super(centerX, centerY, "사각형");
		this.width = width;
		this.height = height;
	}

	public Rec(int width, int height) {
		super(0, 0, "사각형");
		this.width = width;
		this.height = height;
	}

	protected double calcArea()
	{
		return height*width;
	}
}
