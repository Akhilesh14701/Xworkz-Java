package com.xworkz.august.things;

public class toy {
	public String name="ironman";
	public int no=9;
	public float price=100f;
	
	public int hashCode() {
		System.out.println(this.name);
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
