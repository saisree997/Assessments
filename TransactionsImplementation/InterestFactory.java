package com.planon.TransactionsImplementation;

import java.util.List;

public class InterestFactory {

	public Interest getAccountType(String accountType) {

		try {
			 if(accountType == null){  
	             return null;  
	            }  

			if (accountType.equals("Savings")) {
				return new Savings();
			} else if (accountType.equals("Current")) {
				return new Current();
			}
			else if (accountType.equals("Fixed")) {
				return new Fixed();
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
