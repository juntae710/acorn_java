package day9;

public class 함수_CallbyReference2 {
	public static void main(String[] args) {
		int[] kors= new int [3];
		
		
		kors_( kors);
		
		
		System.out.println(kors[0]);
		System.out.println(kors[1]);
		System.out.println(kors[2]);
		
	
	}

	
	public static void kors_(int[] kors) {
		kors[0]=5;
		kors[1]=8;
		kors[2]=9;	
	
	}
	
}
