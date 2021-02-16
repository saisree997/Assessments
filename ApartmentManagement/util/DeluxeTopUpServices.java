package com.planon.util;

import java.util.logging.Logger;

import com.planon.client.Client;

public class DeluxeTopUpServices extends EliteTopUpServices {
	private static final  Logger log = Logger.getLogger(Client.class.getName());
	/**
	 * Constructor which tells the user  to choose from
	 */
	public DeluxeTopUpServices() {
		super();
		log.info("Gym");
		log.info("Swimming Pool");
		log.info("Club");
	}
}