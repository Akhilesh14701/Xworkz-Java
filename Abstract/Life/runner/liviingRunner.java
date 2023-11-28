package runner;

import abstracts.living;
import abstractsImplementation.livingImp;

public class liviingRunner {

	public static void main(String[] args) {
		living l=new livingImp();
		l.info();
		l.level();
		System.out.println(l.lifespan());
		System.out.println(l.live());
		l.work();

	}

}
