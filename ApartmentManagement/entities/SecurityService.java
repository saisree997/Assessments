package com.planon.entities;

import com.planon.client.Service;

/**
 * Class contains service name and cost for "Security" service
 *
 */
public class SecurityService implements Service {

	private String serviceName = "Security";
	private double costOfService = 1000;

	@Override
	public String getServicename() {
		return serviceName;
	}

	@Override
	public double getCost() {
		return costOfService;
	}

}
