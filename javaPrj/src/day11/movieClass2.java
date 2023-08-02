package day11;

public class movieClass2 {

	private String title; //클래스형은 null
	private String genre;
	private String runningtime;
	private String rating;
	
	public void input (String title, String genre, String runningtime, String rating) {
		this.title=title;
		this.genre=genre;
		this.runningtime=runningtime;
		this.rating=rating;
		
	}
	//생성자 , 매개변수가 있는 생성자
	//생성자 규칙 : 반드시 클래스명 동일 , 반환타입을 명시하면 안됨
	//생성자를 만들지 않으면 기본생성자를 하나 제공함 (default 생성자)매개변수가 없는 생성자.
	//프로그래머가 생성자를 하나라도 만들면 기본생성자는 제공이 안됨
	// 프로그래머가 기본생성자를 만들어야 함
	public movieClass2(String title, String genre, String runningtime, String rating) {
		this.title=title;
		this.genre=genre;
		this.runningtime=runningtime;
		this.rating=rating;
	}
	
	public movieClass2() {
		
	}
	
	public void printInfo() {
		System.out.println("제목:"+title);
		System.out.println("장르:"+genre);
		System.out.println("상영시간:"+runningtime);
		System.out.println("관람가:"+rating+"\n");
		
	}
	
}