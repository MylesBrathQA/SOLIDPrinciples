package com.qa.openclose;

public class Circle implements Shape {
	
	private double radius;
	
	public double AreaCalculator() {
		return (this.radius * this.radius) * Math.PI;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	
}
