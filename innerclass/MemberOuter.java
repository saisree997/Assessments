/**
 * ex of member inner class to access private variable of outer class
 */
package com.planon.innerclass;

public class MemberOuter {
	
		 private int data=30;  
		 class MemberInner{  
		  void msg()
		  {
			  System.out.println("data is "+data);
			  }  
		 }  
		 public static void main(String args[]){  
			  
			 
			 MemberOuter outobj = new MemberOuter();
			 MemberOuter.MemberInner inobj = outobj.new MemberInner();
			 inobj.msg();
		}  
	
}
