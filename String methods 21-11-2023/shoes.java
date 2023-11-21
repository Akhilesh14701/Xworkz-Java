package com.xworkz.august.things;

public class shoes {
	
	public int hashCode() {
		System.out.println("hashcode");
		System.out.println(shoes.class);
		return 0;
	}
	
	public boolean equals(Object obj) {
		System.out.println("overriding equals");
		return false;
		
	}
	
	public String toString() {
		return "akhil";
	}
	
}
