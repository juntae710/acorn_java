package day11;

//학생성적정보를 담을 수 있는 자료형 틀 만들기
//멤버변수 + 멤버매서드 (멤버변수를 사용하는 매서드)
//멤버매서드는 객체가 생성된 이후부터 가능하다.

//type 정의함 주의사항 : 변수가 만들어진것이 아니다.
public class Score {

	// 맴버변수 (인스턴트 변수)
	String name;
	int kor;
	int eng;
	int math;
	boolean result;

	// 값의 초기화 담당 => 특별한 매서드 => 생성자
	// 반환타입 명시하면 생성자가 아닌 그냥 매서드
	// 이름은 반드시 클래스명과 동일
	// 객체가 생성될 떄 (new을 통해 생성)값의 초기화를 담당하는 특별한 매서드
	// 생성자를 하나도 만들지 않으면 기본생성자를 제공합니다.
	// 생성자를 하나라도 만들면 기본생성자를 제공하지 않음.

	// 생성자가 여러개 일경우 생성자 오버로딩 매개변수가 반드시 달라야 한다.
	// 오버로딩이란 매서드의 이름은 동일하고 매개변수가 다른경우를 말한다.
	//오버로딩시 반환타입이 다른것은 오버로딩이 되지 않는다.
	public Score() {
	}

	// 생성자에게 객체변수값의 초기화 담당
	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public Score(String name) {
		this(name,60, 60, 60);
		//생성자 끼리는 호출 가능 (단 첫줄에 와야 한다.)
		//생성자 호출시 this() 표현으로 호출함
		
//		this.name = name;
//		this.kor = 60;
//		this.eng = 60;
//		this.math = 60;
	}
	
	public void calResult() {
		int sum = kor + eng + math;
		double avg = sum/3.0;
		if (avg >= 80 ) {
			result = true;
		}else {
			result = false;
		}
	}
	
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.kor);
		System.out.println(this.eng);
		System.out.println(this.math);
		System.out.println(this.result);
	}
	//현재 객체정보를 문자열로 반환하는 기능
	public String toString() {
		return name + " " + kor + " " + eng + " " + math + " "result;
	}
}
