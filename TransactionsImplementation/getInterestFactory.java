package com.planon.assignment4;

import java.util.List;

public class getInterestFactory {
	
	 double Interest;

	public double getInterest(String accountType) {
		
try {
			
			if(accountType.equals("Savings"))
				{
					Interest = Savings.interest;
				}
				else if(accountType.equals("Current"))
				{
					Interest = Current.interest;
				}
				
				else if(accountType.equals("Fixed"))
				{
					Interest = Fixed.interest;
				}
				else{
					}
			}
				
		catch(Exception e) {
			e.printStackTrace();
		}
		return Interest;
		
		}
		
	}
	
