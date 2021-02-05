package com.planon.builder;

public class Strore {
	
	public static void main(String args[])
	{
	Computer com = new ComputerBuilder("Windows", "Intel core", 64).getComputer();
	//Computer com1 = new ComputerBuilder().setOs("Windows").setProcessor("intel core").getComputer();
	
	System.out.println(com);
	
}
}