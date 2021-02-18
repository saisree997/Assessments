package com.planon.entities;

/**
 * Class contains service name and cost of service "Four Wheeler Parking"
 *
 */

public class FourWheelerParkingService implements Service{
	
	private double costOfService = 200;
	private String serviceName = "Four Wheeler Parking";

	@Override
	public String getServicename() {
		return serviceName;
	}

	@Override
	public double getCost() {
		return costOfService;
	}

}
