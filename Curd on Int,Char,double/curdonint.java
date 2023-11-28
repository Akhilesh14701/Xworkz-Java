package com.xworkz.august.things;

public class curdonint {
	public int index=0;
	public int id[]=new int[6];
	
	public void insertion(int id) {
		if(index<this.id.length) {
			this.id[index]=id;
			index++;
		}else {
			System.out.println("Array is full");
		}
	}
	
	public void update(int newId,int oldId) {
		for(int i=0;i<this.id.length;i++) {
			if(this.id[i]==oldId) {
				this.id[i]=newId;
				break;
			}
			if(i==(this.id.length-1)) {
				System.out.println("element not found");
				break;
			}
		}
		
	}
	
	
	public void delete(int value) {
		for(int i=0;i<this.id.length;i++) {
			if(this.id[i]==value) {
				this.id[i]=0;
				break;
			}
			if(i==(this.id.length-1)) {
				System.out.println("element not exists in the array");
				break;
			}
		}
	}
	
	public void read() {
		for(int i=0;i<this.id.length;i++) {
			if(this.id[i]!=0)
			System.out.println(this.id[i]);
		}
	}

}
