package com.planon.entities;

import com.planon.client.Service;

/**
 *  Class contains service name and cost of service "Gym"
 *
 */

public class GymService implements Service {

	private String serviceName = "Gym";
	private double costOfService = 500;

	@Override
	public String getServicename() {
		return serviceName;
	}

	@Override
	public double getCost() {
		return costOfService;
	}

}
