package runner;

import abstracts.sweethome;
import abstractsImplementation.sweethomeImp;

public class sweethomerunner {

	public static void main(String[] args) {
		sweethome s=new sweethomeImp();
		s.familyName();
		System.out.println(s.jointFamily());
		s.noOfPeople();

	}

}
