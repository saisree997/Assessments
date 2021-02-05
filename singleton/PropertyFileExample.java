/**
 * db property file loading using singleton pattern
 */

package com.planon.singleton;

import java.io.*;
import java.util.Properties;

public class PropertyFileExample {
	static PropertyFileExample instanceobj;
	static public String port = null;
	static public String database = null;
	static public String ip = null;
	static public String user = null;
	static public String pass = null;
	static public String jdbc = null;
	static public String driver = null;
	static public String instance = null;

	private PropertyFileExample() {
		try {
			InputStream file = new FileInputStream(new File("D:\\db.properties"));
			Properties props = new Properties();
			props.load(file);
			port = props.getProperty("PORT");
			ip = props.getProperty("IP");
			database = props.getProperty("DATABASE");
			user = props.getProperty("USER");
			pass = props.getProperty("PASS");
			jdbc = props.getProperty("JDBC");
			driver = props.getProperty("DRIVERNAME");
			instance = props.getProperty("INSTANCE");
		} catch (Exception e) {
			System.out.println("error" + e);
		}
	}

	public static void main(String[] args) {
		PropertyFileExample dbInfo = PropertyFileExample.getInstance();
		String connString = dbInfo.jdbc + "://" + dbInfo.ip + "\\" + dbInfo.instance + ":" + dbInfo.port
				+ "; databaseName=" + dbInfo.database + "; userName=" + dbInfo.user + "; passWord=" + dbInfo.pass + ";";
		System.out.println(connString);

	}

	static public PropertyFileExample getInstance() {
		if (instanceobj == null) {
			instanceobj = new PropertyFileExample();
		}
		return instanceobj;
	}
}