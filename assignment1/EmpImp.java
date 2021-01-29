package com.planon.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmpImp {

	public static void main(String args[]) {

		Set<Employee> hash_Set = new HashSet<Employee>();
		Employee emp = new Employee("Joey", "Sales", 480000);
		hash_Set.add(emp);
		emp = new Employee("Ross", "Operation", 550000);
		hash_Set.add(emp);
		emp = new Employee("Monica", "Manager", 450000);
		hash_Set.add(emp);
		emp = new Employee("Phoebe", "Sales", 600000);
		hash_Set.add(emp);
		emp = new Employee("Chandler", "Developer", 530000);
		hash_Set.add(emp);
		emp = new Employee("Rachel", "Operation", 580000);
		hash_Set.add(emp);
		List<Employee> list = new ArrayList<Employee>(hash_Set);

		// to calculate the incremented salary
		CalculateIncSal(list);

		// to sort the employee list
		Collections.sort(list);

		// to print the sorted list
		for (Employee e : list) {
			System.out.println(e.name + " " + e.dept + " " + e.salary);
		}
	}

	public static void CalculateIncSal(List<Employee> empList) {

		Department dep = new Department();
		for (Employee emp : empList) {
			double appfactor = dep.getappfactor(emp.getDept()) / 100;
			double salary = emp.getSalary() + (emp.getSalary() * appfactor);
			emp.setSalary(salary);
		}
	}
}
