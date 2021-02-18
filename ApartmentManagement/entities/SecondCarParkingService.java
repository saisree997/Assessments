package com.planon.entities;

import com.planon.client.Service;

/**
 * Class contains service name and cost of service "Second Car Parking"
 *
 */

public class SecondCarParkingService implements Service{
	
	private String serviceName = "Second Car Parking";
	private double costOfService = 400;

	@Override
	public String getServicename() {
		return serviceName;
	}

	@Override
	public double getCost() {
		return costOfService;
	}

}
