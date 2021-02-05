/****
 * this class is to write InvalidName exception
 *  it get's triggers when name entered through input is exceeding the length specified
 * @author saisree
 */

package com.planon.UserDefinedException;

public class InvalidNameException extends Exception{

	public InvalidNameException(String msg) {
		super(msg);
	}
}
