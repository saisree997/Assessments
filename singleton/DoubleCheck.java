package com.planon.singleton;

public class DoubleCheck {

	
	public static void main(String[] args)
	{
		Thread T1 = new Thread(new Runnable() {
			public void run() {
				demo4 obj = demo4.getInstance();
			}
		});
		Thread T2 = new Thread(new Runnable() {
			public void run() {
				demo4 obj1 = demo4.getInstance();
			}
		});
		T1.start();
		T2.start();
	}

}
class demo4
{
	static demo4 obj;
	private demo4()
	{
		System.out.println("Instance created");
	}
	static  demo4  getInstance() //synchronized
	{
		if(obj == null)
		{
			synchronized(demo.class)
			{
			if(obj == null) {
				obj = new demo4();
			}
			}
		}
		return obj;
		
	}
}