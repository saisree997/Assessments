/****
 * this class is to write MissingNmae exception
 *  it get's triggers when name entered through input is null
 * @author saisree
 */


package com.planon.UserDefinedException;

public class MissingNameException extends Exception {

	public MissingNameException(String msg) {
		super(msg);
	}

}
