package day11.animal;

import day11.imheritance.Student;

public class test {

	public static void main(String[] args) {
		dog d = new dog();
		d.강아지();
		printanimal(d);
		d.산책하기();
		d.짖기();
		System.out.println();
		
		cat c = new cat();
		c.고양이();
		printanimal(c);
		c.짖기();
		c.식빵굽기();
		System.out.println();
		
		rabbit r = new rabbit();
		r.토끼();
		printanimal(d);
		r.굴파기();
		r.짖기();
		System.out.println();
		
		animal d2 = new dog();
		// d2.강아지();
		d2.일어나기();
		d2.밥먹기();
		d2.뛰어놀기();
		// d2.산책하기();
		d2.잠자기();
		System.out.println();
		
		dog d3 = (dog) d2;
		d3.강아지();
		d3.일어나기();
		d3.밥먹기();
		d3.뛰어놀기();
		d3.산책하기();
		d3.잠자기();

	}
	public static void printanimal (animal animal) {
		animal.일어나기();
		animal.밥먹기();
		animal.뛰어놀기();
		animal.잠자기();
		
	}

}
