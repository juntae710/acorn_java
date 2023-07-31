package day10;

public class Movie {
	String MovieName;
	int time;
	
	public void Movies(String MovieName, int time) {
		this.MovieName=MovieName;
		this.time=time;
	}
	public String printInpo() {
		return "영화제목:" + MovieName +" 상영시간:"+time+"분";
	}
}
