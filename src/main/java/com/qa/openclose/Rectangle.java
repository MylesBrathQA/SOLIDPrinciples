package com.qa.openclose;

public class Rectangle implements Shape {

    private double length;
    private double width;

    //Methods
    public double AreaCalculator() {
		return length * width;
	} 
    
    //Getters and Setter
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

	
}
