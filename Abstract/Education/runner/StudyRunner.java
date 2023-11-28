package runner;

import abstracts.Study;
import abstractsImplementation.studing;

public class StudyRunner {

	public static void main(String[] args) {
		Study s=new studing();
		
		s.details();
		System.out.println(s.fees());
		s.info();
		s.noOfStudents();
		
		

	}

}
