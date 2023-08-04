package day14.ExceptionEx;

public class MyMath {
	//예외 던지기 , 에외미루기
	public int add( int num1 , int num2) throws NegativeNumberException {		
		if( num1 <0  || num2 <0 ) {
			//예외 발생 시는
			//에외 발생시키는 키워드 throw
			throw new NegativeNumberException();
		}
		
		return num1+  num2;
	}
	
	public int add2( int num1 , int num2){		
		if( num1 <0  || num2 <0 ) {
			//예외 발생 시는
			//에외 발생시키는 키워드 throw
			throw new NegativeNumberException2();
		}
		return num1+  num2;
	}
}
