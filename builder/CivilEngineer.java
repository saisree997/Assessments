package com.planon.builder;

public class CivilEngineer {
	
	
	private HouseBuilder houseBuilder; 
	  
    public CivilEngineer(HouseBuilder houseBuilder) 
    { 
        this.houseBuilder = houseBuilder; 
    } 
  
    public House getHouse() 
    { 
        return this.houseBuilder.getHouse(); 
    } 
  
    public void constructHouse() 
    { 
        this.houseBuilder.buildBasement(); 
        this.houseBuilder.bulidRoof(); 
        this.houseBuilder.buildInterior(); 
    } 

}
