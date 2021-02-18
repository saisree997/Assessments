package com.planon.entities;

/**
 * PowerBackUpService class contains service name and cost of service "Power BackUp"
 *
 */

public class PowerBackUpService implements Service{
	
	private double costOfService = 200;
	private String serviceName = "Power BackUp";

	@Override
	public String getServicename() {
		return serviceName;
	}

	@Override
	public double getCost() {
		return costOfService;
	}

}
