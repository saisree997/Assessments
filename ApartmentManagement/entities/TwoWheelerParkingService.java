package com.planon.entities;

/**
 * TwoWheelerParkingService class contains service name and cost of service "Two Wheeler Parking"
 *
 */

public class TwoWheelerParkingService implements Service{
	
	private double costOfService = 100;
	private String serviceName = "Two Wheeler Parking";

	@Override
	public String getServicename() {
		return serviceName;
	}

	@Override
	public double getCost() {
		return costOfService;
	}

}
