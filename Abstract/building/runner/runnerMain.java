package runner;

import abstractsImplementation.develop;

public class runnerMain {

	public static void main(String[] args) {
		develop d = new develop();
		System.out.println(d.cost());
		d.days();
		d.details();
		System.out.println(d.noOfPeople());
		d.person();

	}

}
