package com.planon.assignment4;

import java.util.List;

public class CalculateInterest {
	
	double interestamt;
	public Double calculateInterest(Transaction trans)
	{ 
		
		getInterestFactory ins = new getInterestFactory();
		interestamt = (trans.getAmount()/constants.Q1)*ins.getInterest(trans.getAccountType());
		return interestamt;
		}

}
