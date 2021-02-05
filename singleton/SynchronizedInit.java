/**
 * demo for synchronized intialization of singleton instance
 */
package com.planon.singleton;

public class SynchronizedInit {
	
	public static void main(String[] args)
	{
		Thread T1 = new Thread(new Runnable() {
			public void run() {
				demo2 obj = demo2.getInstance();
			}
		});
		Thread T2 = new Thread(new Runnable() {
			public void run() {
				demo2 obj1 = demo2.getInstance();
			}
		});
		T1.start();
		T2.start();
	}

}
class demo2
{
	static demo2 obj;
	private demo2()
	{
		System.out.println("Instance created");
	}
	static   synchronized demo2  getInstance() //synchronized
	{
		if(obj == null)
		{
		obj = new demo2();
		}
		return obj;
		
	}
}