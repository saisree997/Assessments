/****
 * this class is to get list of colleges
 * which are under scholarship application
 * @author saisree
 */

package com.planon.UserDefinedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollegeList {

	public static List<String> getCollegeList() {
	
	ArrayList<String> collegeslist = new ArrayList<String>();
	
	collegeslist.add("OU");
	collegeslist.add("ANNA");
	collegeslist.add("IIT");
	collegeslist.add("ANNA");
	collegeslist.add("VIT");
	collegeslist.add("SRM");
	collegeslist.add("NIT");
	collegeslist.add("IIIT");
	
	List<String> immutablelist = Collections .unmodifiableList(collegeslist); 
	
	return immutablelist;
	
	
	
	

}

}