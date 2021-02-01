package com.planon.assignment1;

import java.io.EOFException;

public class Department {
	
 double appfactor;
 
 
public double getappfactor(String dept) {
	try {
		if(dept!=null & dept.equals("Developer")) {
			 appfactor  = Developer.appfactor;
		}
			else if(dept!=null & dept.equals("Sales")) {
				 appfactor  = Sales.appfactor;
			}
			else if(dept!=null & dept.equals("Operation")) {
				 appfactor  = Operation.appfactor;
			}
			else if(dept!=null & dept.equals("Manager")) {
				 appfactor  = Manager.appfactor;
			}
			else
			{
			}
	}
	
	catch(Exception e) {
		e.printStackTrace();
	}
	return appfactor;
	
	}

}
