package org.dimigo.inheritance;

public class Figure {
	public int centerX;
	public int centerY;
	public String name;
	
	public Figure(int centerX, int centerY, String name) {
		super();
		this.centerX = centerX;
		this.centerY = centerY;
		this.name = name;
	}
	
	protected double calcArea()
	{
		return 0;
	}

	protected void printCenter()
	{
		System.out.println(name + " 중심좌표 : (" + centerX + ", " + centerY + ")");
	}
	
	protected void moveFigure(int x, int y)
	{
		centerX += x;
		centerY += y;
	}
}
