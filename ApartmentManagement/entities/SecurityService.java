package com.planon.entities;

/**
 * SecurityService class contains service name and cost of service "Security"
 *
 */

public class SecurityService implements Service{

	private double costOfService = 1000;
	private String serviceName = "Security";
	
	@Override
	public String getServicename() {
		return serviceName;
	}
	@Override
	public double getCost() {
		return costOfService;
	}
	
}
