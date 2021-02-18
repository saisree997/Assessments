package com.planon.entities;

/**
 * Interface to get name and cost of service based on the object created
 *
 */
public interface Service {

	/**
	 * method to get the service name
	 * 
	 * @return
	 */
	public String getServicename();

	/**
	 * method to get the cost
	 * 
	 * @return
	 */
	public double getCost();
}
