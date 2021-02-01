/****
 * this class is to get input student details 
 * @author saisree
 */

package com.planon.assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDetails {

	public static ArrayList getStudentDetails() {

		ArrayList<student> studentdetails = new ArrayList<student>();

		studentdetails.add(new student("jhon", 95, "OU"));
		studentdetails.add(new student("reo", 45, "IIT"));
		studentdetails.add(new student("mary", 67, "ABC"));
		studentdetails.add(new student("reo", 45, "IIT"));
		studentdetails.add(new student("", 87, "JNTU"));
		studentdetails.add(new student("rerytiurnviyhruiynuytvnto", 87, "JNTU"));
		
		return studentdetails;

//		ArrayList Studentslist = new ArrayList();
//		Scanner input;
//		System.out.println("Enter the no of students");
//		input = new Scanner(System.in);
//		int NoofStudents = Integer.parseInt(input.nextLine());
//
//		for (int i = 0; i < NoofStudents; i++) {
//
//			System.out.println("Enter the input name marks and college");
//			input = new Scanner(System.in);
//			String a = input.nextLine();
//			Studentslist.add(a);
//		}
//		return Studentslist;
	}

}
