package com.planon.entities;

import com.planon.client.Service;

/**
 * Class contains service name and cost of service "Power BackUp"
 *
 */

public class PowerBackUpService implements Service{
	
	private String serviceName = "Power BackUp";
	private double costOfService = 200;

	@Override
	public String getServicename() {
		return serviceName;
	}

	@Override
	public double getCost() {
		return costOfService;
	}

}
