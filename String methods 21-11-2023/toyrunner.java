package com.xworkz.august.driver;

import com.xworkz.august.things.toy;

public class toyrunner {

	public static void main(String[] args) {
		toyrunner s=new toyrunner();
		toyrunner s1=new toyrunner();
		toy b=new toy();
		toy a= new toy();
		a.no=12;
		
		System.out.println(s.hashCode());  //returns object address in decimal format
		System.out.println(b.hashCode());   // Overriding hashCode()
		
		System.out.println(s.equals(s1));
		System.out.println(b.equals(a)); //Overriding equals()
		
		System.out.println(s.toString());
		System.out.println(b.toString()); // Overriding toString()

	}

}
