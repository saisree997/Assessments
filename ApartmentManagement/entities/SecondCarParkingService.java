package com.planon.entities;

/**
 * Class contains service name and cost of service "Second Car Parking"
 *
 */

public class SecondCarParkingService implements Service{
	
	private double costOfService = 400;
	private String serviceName = "Second Car Parking";

	@Override
	public String getServicename() {
		return serviceName;
	}

	@Override
	public double getCost() {
		return costOfService;
	}

}
