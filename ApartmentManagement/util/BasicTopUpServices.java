package com.planon.util;

import java.util.logging.Logger;

import com.planon.client.Client;

public class BasicTopUpServices extends DeluxeTopUpServices {
	private static final Logger log = Logger.getLogger(Client.class.getName());
	/**
	 * Constructor which tells the user  to choose from
	 */
	public BasicTopUpServices() {
		super();
		log.info("Two wheeler Parking");
		log.info("Four wheeler parking");
	}

}