package day12.인터페이스;

//추상매서드만을 가지고있다.
//설계도로만 사용할 떄 사용한다.
//abstract 키워드 생략 가능함
public interface CalculatorI {
	public int add (int su1 , int su2);
	public int sub (int su1 , int su2);
	public int multi (int su1 , int su2);
	public int divide (int su1 , int su2);
	
}
