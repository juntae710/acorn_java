package day12.상속예제;

public class car {
	String 제조사;
	String 차종;
	String 차번호;

	public car() {
		this("미등록","미등록","미등록");
	}

	public car(String 제조사, String 차종, String 차번호) {
		this.제조사=제조사;
		this.차종=차종;
		this.차번호=차번호;
	}
	
	
}
