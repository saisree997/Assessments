package com.planon.builder;

public class IglooHouseBuilder implements HouseBuilder {

	
	private House house; 

	public IglooHouseBuilder() 
	{ 
		this.house = new House(); 
	} 

	public void buildBasement() 
	{ 
		house.setBasement("Ice Bars"); 
	} 

	public void buildInterior() 
	{ 
		house.setInterior("Ice Carvings"); 
	} 

	public void bulidRoof() 
	{ 
		house.setRoof("Ice Dome"); 
	} 

	public House getHouse() 
	{ 
		return this.house; 
	} 
} 
	
