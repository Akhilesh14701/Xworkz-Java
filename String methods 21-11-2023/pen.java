package com.xworkz.august.things;

public class pen {
	public String color="blue";
	public int no=12;
	public float price=10f;
	
	public int hashCode() {
		System.out.println(this.color);
		return no;
	}
	
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		return false;
		
	}
	
	public String toString() {
		return "akhil";
	}
}
