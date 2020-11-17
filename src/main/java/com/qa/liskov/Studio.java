package com.qa.liskov;

public class Studio {
	private int numberOfBedrooms = 1;
	private int squareFootage;
	
	
	public Studio() {
	}

	//Getters and Setters
	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}


	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}


	public int getSquareFootage() {
		return squareFootage;
	}


	public void setSquareFootage(int squareFootage) {
		this.squareFootage = squareFootage;
	}
	
	
}
