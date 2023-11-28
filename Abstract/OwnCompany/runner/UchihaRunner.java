package runner;

import abstracts.Uchiha;
import abstractsImplementation.Uchihaimp;

public class UchihaRunner {

	public static void main(String[] args) {
		Uchiha u = new Uchihaimp();
		u.info();
		System.out.println(u.total());
	}

}
