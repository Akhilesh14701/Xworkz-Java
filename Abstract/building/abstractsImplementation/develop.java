package abstractsImplementation;

import abstracts.development;

public class develop extends development {
	
	@Override
	public void details() {
		System.out.println("Building develop started");
	}
	public int cost(){
		return 999;
	}
	public void person() {
		System.out.println("Building Owner adhi");
	}
	public int noOfPeople() {
		return 50;
	}
	public void days() {
		System.out.println("It will take 50 days");
	}

}
