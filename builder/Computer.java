package com.planon.builder;

public class Computer {
	
	
	private String os;
	private String processor;
	private int ram;
	public Computer(String os, String processor, int ram) {
		this.os = os;
		this.processor = processor;
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Computer [os=" + os + ", processor=" + processor + ", ram=" + ram + "]";
	}

}
