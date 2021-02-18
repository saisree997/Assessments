package com.planon.entities;


/**
 * MaintainanceService class contains service name and cost of service "Maintenance"
 *
 */

public class MaintainanceService implements Service {

	private double costOfService = 1000;
	private String serviceName = "Maintainance";

	@Override
	public String getServicename() {
		return serviceName;
	}

	@Override
	public double getCost() {
		return costOfService;
	}

}
