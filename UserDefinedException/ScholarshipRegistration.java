/****
 * this class is to get student details 
 * like name percentage and college name 
 * and check whether eligible for scholarship registration or not
 * @author saisree
 */


package com.planon.assignment3;

import java.util.ArrayList;
import java.util.List;

public class ScholarshipRegistration {

	static void scholarshipCriteria(List<student> student_list, List<String> collegeslist )
			throws InvalidMarksException, MissingNameException, InvalidNameException, CollegeNotFoundException {
		try {
			
			CollegeList cl = new CollegeList();
			//collegeslist.add("SSN");

			for (student s : student_list) {
				
				if (s.getPercentage() < 50) {
					throw new InvalidMarksException(
							s.getName() + " " + "Not Eligible for Scholarship percentage should be greater than 50");
				}
				if (s.getName() == null || s.getName().equals("")) {
					
					throw new MissingNameException("Name is missing..please enter name");
				}
				if (s.getName().length() > 20)
				{
					throw new InvalidNameException(
							"please enter valid name..name should contain less than or equals to 20 characters");
				}
				if(!collegeslist.contains(s.getCollegeName()))
					{		
						throw new CollegeNotFoundException("this college is not under scholarship application");
					}
					
					System.out.println(s.getName() + " " + "Eligible for Scholarship");
				}
				
		}
			catch (InvalidMarksException e) {
			System.out.print(e);
			}
			catch (MissingNameException e) {
				System.out.print(e);
			}
			catch (InvalidNameException e) {
				System.out.print(e);
			}
			catch (CollegeNotFoundException e) {
				System.out.print(e);
			}
		
		}

	public static void main(String[] args)
			throws InvalidMarksException, MissingNameException, InvalidNameException, CollegeNotFoundException {

		List<student> student_list = StudentDetails.getStudentDetails();
		List<String> collegeslist = CollegeList.getCollegeList();
		
		//to check creteria for scholarship registraion
		scholarshipCriteria(student_list, collegeslist);
	}
}
