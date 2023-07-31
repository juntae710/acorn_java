package day10.Calculator;

public class Calculator {

	public static void main(String[] args) {
		com_acorn_pjt calculator = new com_acorn_pjt();
		
		int a = com_acorn_pjt.Plus(4,2);
		System.out.println(a);
		
		int b = com_acorn_pjt.subtract(4, 2);
		System.out.println(b);
		
		int c = com_acorn_pjt.multiply(4, 2);
		System.out.println(c);
		
		int d = com_acorn_pjt.divide(4, 2);
		System.out.println(d);
	}

}
