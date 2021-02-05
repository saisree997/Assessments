package com.planon.builder;

public class ComputerBuilder {
	
	private String os;
	private String processor;
	private int ram;
	
	
	public ComputerBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public ComputerBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public ComputerBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}

	public Computer getComputer()
	{
		return new Computer(os, processor, ram);
	}
	public ComputerBuilder(String os, String processor, int ram) {
		super();
		this.os = os;
		this.processor = processor;
		this.ram = ram;
	}
}
