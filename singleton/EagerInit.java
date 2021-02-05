/**
 * demo for eager intialization of singleton instance
 */

package com.planon.singleton;

public class EagerInit {
	
	public static void main(String[] args)

	{
		demo display1 = demo.getInstance();
		demo dispaly2 = demo.getInstance();
	}	
}

class demo{
	static demo obj = new demo();
	//static object
	private demo() //private constructor
	{
		System.out.println("Instance created");
	}
	public static  demo getInstance() //static method to get the instance of object
	{
		return obj;
		
	}
	public void view()
	{
		
	}
}
