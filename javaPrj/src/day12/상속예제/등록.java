package day12.상속예제;

public class 등록 extends car {
	String 등록지역;
	
	public 등록(String 제조사, String 차종, String 차번호 ,String 등록지역 ) {
//		this.제조사=제조사;
//		this.차종=차종;
//		this.차번호=차번호;
		
		super(제조사,차종,차번호);
		this.등록지역=등록지역;
	}
	public String toString() {
		return 제조사+" "+차종+" "+차번호+" "+등록지역;
	}
}
