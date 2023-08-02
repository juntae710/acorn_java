package day12.객체배열;

public class Score {
	String no;
	int kor ;
	int eng ;
	int tot ;
	
	public Score(){}
	
	public Score(String no,int kor,int eng, int tot){
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.tot=tot;
	}
	@Override
	//부모의 매서드의 재정의
	public String toString() {
		
		return no + " " + kor +" "+ eng +" "+ tot;
	}
}
