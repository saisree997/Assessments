package com.planon.entities;

/**
 * ClubService class contains service name and cost of service "Club"
 *
 */

public class ClubService implements Service{
	
	private double costOfService = 1000;
	private String serviceName = "Club";

	@Override
	public String getServicename() {
		return serviceName;
	}

	@Override
	public double getCost() {
		return costOfService;
	}

}
