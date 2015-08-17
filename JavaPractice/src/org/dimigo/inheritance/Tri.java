package org.dimigo.inheritance;

public class Tri extends Figure {
	public int width;
	public int height;
	
	public Tri(int centerX, int centerY, int width, int height) {
		super(centerX, centerY, "삼각형");
		this.width = width;
		this.height = height;
	}
	
	public Tri(int width, int height) {
		super(0, 0, "삼각형");
		this.width = width;
		this.height = height;
	}

	protected double calcArea()
	{
		return height*width/2;
	}
}
