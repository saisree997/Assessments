/**
 * demo for lazy intialization of singleton instance
 */

package com.planon.singleton;

public class LazyInit {
	
	public static void main(String[] args)
	{
		demo1 obj = demo1.getInstance();
		
	}
}

class demo1
{
	static demo1 obj;
	private demo1()
	{
		
	}
	static demo1 getInstance()
	{
		if(obj == null)
		{
		obj = new demo1();
		}
		return obj;
		
	}
}
