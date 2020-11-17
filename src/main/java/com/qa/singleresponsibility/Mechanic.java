package com.qa.singleresponsibility;

public class Mechanic {
	
	private boolean passedMOT;
	private boolean passedBreakTest;
	
	//Methods
	public void conductMOT() {
		passedMOT = true;
	}
	
	public void testBrakes() {
		passedBreakTest = true;
	}

	public boolean isPassedMOT() {
		return passedMOT;
	}
}
