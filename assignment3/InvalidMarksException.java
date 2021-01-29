/****
 * this class is to write InvalidMarks exception
 *  it get's triggers when percentage entered through input is less than the required percentage
 * @author saisree
 */

package com.planon.assignment3;

public class InvalidMarksException extends Exception{

	public InvalidMarksException(String msg) {
		super(msg);
	}

}
