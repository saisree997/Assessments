package com.planon.builder;

public class House implements HousePlan{

	private String basement; 
	private String roof; 
	private String interior; 

	public void setBasement(String basement) 
	{ 
		this.basement = basement; 
	} 
	public void setRoof(String roof) 
	{ 
		this.roof = roof; 
	} 

	public void setInterior(String interior) 
	{ 
		this.interior = interior; 
	} 

} 
