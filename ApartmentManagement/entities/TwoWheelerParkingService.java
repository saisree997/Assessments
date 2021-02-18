package com.planon.entities;

import com.planon.client.Service;

/**
 * Class contains service name and cost of service "Two Wheeler Parking"
 *
 */

public class TwoWheelerParkingService implements Service{
	
	private String serviceName = "Two Wheeler Parking";
	private double costOfService = 100;

	@Override
	public String getServicename() {
		return serviceName;
	}

	@Override
	public double getCost() {
		return costOfService;
	}

}
