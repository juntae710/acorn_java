package day13.성적관리;

public class Score {
	//멤버변수
	private String name;
	private int kor;
	private int eng;
	private String result;
	
	
	
	//생성자
	//this : 참조형변수 , 자기 참조형 변수
	//단 static 매서드에는 this가 전달되지 않음.
	public Score ( String name, int kor,int eng) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		calResult();
	}
	public Score ( ) {}
	
	
	
	public void calResult() {
		int sum = kor + eng;
		double avg = sum /2.0;
		if (avg>=80)
			result="합격";
		else
			result="불합격";
	}
	
	
	
	
	@Override
	public String toString() {
		
		return "Score[name:"+name +" kor:"+kor +" eng:"+eng +" result:"+result + "]";
	}
	
	
	//static 매서드는 클래스명.매서드() 를 통해 사용
//	public static void print () {
//		System.out.println("************");
//		System.out.println(name);  맴버 변수 (인스턴스변수를 사용할 수 없다.)
//	}
	
	
	
	
	//쎄터 set 첫글자 대문자 규칙
	//겟터 get 첫글자 대문자 규칙
	
	
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getName() {
		return name;
	}
	
	//비교객체
		public boolean equals( Score obj) {		 
			boolean result=false;		
			if( this.name.equals(obj.name))
				result=true;		
			return result ;
		}
}
