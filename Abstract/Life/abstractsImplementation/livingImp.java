package abstractsImplementation;

import abstracts.living;

public class livingImp extends living {
	public  void info() {
		System.out.println("Life Is Beautiful");
	}
	public int lifespan() {
		return 70;
	}
	public void level() {
		System.out.println("Hard");
	}
	public void work() {
		System.out.println("Nope");
	}
	public boolean live() {
		return true;
	} 
}
