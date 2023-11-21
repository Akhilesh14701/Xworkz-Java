package com.xworkz.august.driver;

import com.xworkz.august.things.shoes;

public class shoesRunner  {

	public static void main(String[] args) {
		shoesRunner s=new shoesRunner();
		shoesRunner s1=new shoesRunner();
		shoes b=new shoes();
		
		System.out.println(s.hashCode());  //returns object address in decimal format
		System.out.println(b.hashCode());   // Overriding hashCode()
		System.out.println(s.equals(s1));
		System.out.println(b.equals(b)); //Overriding equals()
		System.out.println(s.toString());
		System.out.println(b.toString()); // Overriding toString()
		
		

	}

}
