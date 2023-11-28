package com.xworkz.august.driver;

import com.xworkz.august.things.curdonchar;
import com.xworkz.august.things.curdondouble;
import com.xworkz.august.things.curdonint;

public class CurdOnintfloatdoublerunner {

	public static void main(String[] args) {
		
		curdonint i = new curdonint();
		i.insertion(10);
		i.insertion(20);
		i.insertion(30);
		i.insertion(40);
		i.insertion(50);
		i.insertion(60);
		i.insertion(70);
		System.out.println("After Insertion");
		i.read();
		i.update(90, 20);
		System.out.println("After Updation");
		i.read();
		i.delete(40);
		System.out.println("After Deletion");
		i.read();
	
		curdonchar c=new curdonchar();
		c.insertion('A');
		c.insertion('B');
		c.insertion('C');
		c.insertion('D');
		c.insertion('E');
		c.insertion('F');
		System.out.println("After Insertion");
		c.read();
		c.update('k','D');
		System.out.println("After updation");
		c.read();
		c.delete('E');
		System.out.println("After Deletion");
		c.read();
		
		curdondouble d=new curdondouble();
		d.insertion(2000);
		d.insertion(3000);
		d.insertion(4000);
		d.insertion(6000);
		d.insertion(7000);
		d.insertion(8000);
		System.out.println("After Insertion");
		d.read();
		d.update(10000,6000);
		System.out.println("After updation");
		d.read();
		d.delete(3000);
		System.out.println("After Deletion");
		d.read();
		
		
		
	}

}
