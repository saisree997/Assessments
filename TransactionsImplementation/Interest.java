/**
 * 
 */
package com.planon.TransactionsImplementation;

import java.util.HashMap;
import java.util.Map;

public abstract class Interest {
	protected double interestrate; 
	
	abstract double getInterestRate();
	
	public void calculateInterest(Double amount, String quaterernum,double rate,String src) {
		
	 final	Map<String, Integer> noofdaysmap = new HashMap<String,Integer>();
		noofdaysmap.put("Q1", 90);
		noofdaysmap.put("Q2", 91);
		noofdaysmap.put("Q3", 91);
		noofdaysmap.put("Q4", 92);
		noofdaysmap.put("SA1", 181);
		noofdaysmap.put("SA2", 184);
		noofdaysmap.put("A", 365);
		System.out.println("Interest for  quarter  "+ quaterernum + " for source " + src +  " "+ amount/noofdaysmap.get(quaterernum)*(rate));
	}

	public  void CalculatePeriodBasedInterest(Double amount, String quaterernum, double rate, String src,
			int noofdays)
	{
		System.out.println("Interest for  quarter  "+ quaterernum + " for source " + src +  " "+ (amount/noofdays)*rate);
	}

}
