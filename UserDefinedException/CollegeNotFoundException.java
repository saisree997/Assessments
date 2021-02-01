/****
 * this class is to write CollegeNotFound exception
 *  it get's triggers when college entered through input is not listed in the application
 * @author saisree
 */


package com.planon.assignment3;

public class CollegeNotFoundException extends Exception{

	public CollegeNotFoundException(String msg) {
		super(msg);
	}

}
