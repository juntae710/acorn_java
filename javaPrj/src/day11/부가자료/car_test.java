package day11.부가자료;

import day11.Singer;

public class car_test {

	public static void main(String[] args) {
		car c = new car();
		
		c.print();
		
		c.input("Avante", "Hyundai", 2022, "white", 50);
		c.print();
		
		c.start();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.now();
		
		Singer singer = new Singer();
		 
	}

}
