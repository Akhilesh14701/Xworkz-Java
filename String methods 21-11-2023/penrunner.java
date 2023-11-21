package com.xworkz.august.driver;

import com.xworkz.august.things.pen;

public class penrunner {

	public static void main(String[] args) {
		penrunner s=new penrunner();
		penrunner s1=new penrunner();
		pen b=new pen();
		pen a= new pen();
		a.no=12;
		
		System.out.println(s.hashCode());  //returns object address in decimal format
		System.out.println(b.hashCode());   // Overriding hashCode()
		System.out.println(s.equals(s1));
		System.out.println(b.equals(a)); //Overriding equals()
		System.out.println(s.toString());
		System.out.println(b.toString()); // Overriding toString()
		

	}

}
