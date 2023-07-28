package day9;

public class 함수_CallByValue {

	public static void main(String[] args) {
		int a=5, b=6;
		int result = adder(a,b); //데이터 값
		System.out.println(result);
		
		int c=9;
		int result2=input(c);
		c=result2;
	}
	//call by value
	public static int adder(int su1, int su2) {
		return su1+su2;
	}
	public static int input (int su) {
		return 5; 
	
	
}
}