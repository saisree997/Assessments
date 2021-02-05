package com.planon.EmployeeApprisal;
public class Employee implements Comparable<Employee>{  
	public String name;  
	public String dept;  
	public double salary;
	
public Employee(String name, String dept, double salary) {	
		this.name=name;
		this.dept=dept;
		this.salary=salary;
}	

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

//to compare employees based on salary
public int compareTo(Employee e){  
if(salary==e.salary)  
return 0;  
else if(salary>e.salary)  
return -1;  
else  
return 1;  
}


}
