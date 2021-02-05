/****
 * it's POJO of student class to get and set student variables
 * @author saisree
 */
package com.planon.UserDefinedException;

public class student {

	private String name;
	private int percentage;
	private String collegeName;

	public student(String name, int percentage, String collegeName) {
	
		this.name = name;
		this.percentage = percentage;
		this.collegeName = collegeName;
	}
	public int getPercentage() {
		return percentage;
	}

	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
