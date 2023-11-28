package com.xworkz.august.things;

public class curdonchar {
	public int index=0;
	public char sec[]=new char[5];
	
	public void insertion(char id) {
		if(index<this.sec.length) {
			this.sec[index]=id;
			index++;
		}else {
			System.out.println("Array is full");
		}
	}
	
	public void update(char newSec,char oldSec) {
		for(int i=0;i<this.sec.length;i++) {
			if(this.sec[i]==oldSec) {
				this.sec[i]=newSec;
				break;
			}
			if(i==(this.sec.length-1)) {
				System.out.println("element not found");
				break;
			}
		}
		
	}
	
	
	public void delete(char value) {
		for(int i=0;i<this.sec.length;i++) {
			if(this.sec[i]==value) {
				this.sec[i]=0;
				break;
			}
			if(i==(this.sec.length-1)) {
				System.out.println("element not exists in the array");
				break;
			}
		}
	}
	
	public void read() {
		for(int i=0;i<this.sec.length;i++) {
			if(this.sec[i]!=0)
			System.out.println(this.sec[i]);
		}
	}
}
