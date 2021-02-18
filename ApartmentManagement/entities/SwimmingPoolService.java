package com.planon.entities;

/**
 * Class contains service name and cost of service "Swimming Pool"
 *
 */

public class SwimmingPoolService implements Service{

	private double costOfService = 1000;
	private String serviceName = "Swimming Pool";

	@Override
	public String getServicename() {
		return serviceName;
	}

	@Override
	public double getCost() {
		return costOfService;
	}

}
