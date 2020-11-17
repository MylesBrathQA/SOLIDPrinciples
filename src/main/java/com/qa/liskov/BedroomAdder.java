package com.qa.liskov;

public class BedroomAdder {
	public void addBedrooms(Penthouse penthouse, int x) {
		penthouse.setNumberOfBedrooms(penthouse.getNumberOfBedrooms() + x);
	}

}
