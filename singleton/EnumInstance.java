/**
 * Enum INSTANCE is available only for higher than java 1.5 version
 */


package com.planon.singleton;

public class EnumInstance {
	
	public static void main(String args[])
	{
	enumdemo enumobj = enumdemo.INSTANCE;
	enumobj.i = 10;
	enumobj.show();

}
}
enum enumdemo 
{
	INSTANCE;
	int i;
	public void show() {
		System.out.println("value of i "+i);
	}
}