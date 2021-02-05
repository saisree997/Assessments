package com.planon.innerclass;

public class StaticInner {

		  static int data=30;  
		  int value = 20;
		  static class Inner{  
		   void msg(){
			   System.out.println("data is "+data);
			   //System.out.println("value is "+value);
			   }  
		  }  
		  public static void main(String args[]){  
			  StaticInner.Inner obj=new StaticInner.Inner();  
		  obj.msg();  
		  }  
		}  
	
//if static inner class contains static members no need to create instance for that class


//public class StaticInner {
//
//	  static int data=30;  
//	  int value = 20;
//	  static class Inner{  
//	  static void msg(){
//		   System.out.println("data is "+data);
//		   System.out.println("value is "+value);
//		   }  
//	  }  
//	  public static void main(String args[]){  
//		  StaticInner.Inner.msg();  
//	  }  
//	}  