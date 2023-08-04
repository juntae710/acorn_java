package day13.성적관리;



public class ScoreTest3 {

	public static void main(String[] args) {
		
		
		Score s = new Score("홍길동",100,99);
		Score s2 = new Score("홍길동",100,99);
		
		if (s.equals(s2)) {
			System.out.println("같은 학생이다");
		}else {
			System.out.println("같은 학생이 아니다.");
		}
		
		//업캐스팅
		Object o = s;
		Object o2 = s2;
		
		if (o.equals(o2)) {
			System.out.println("같은 학생이다");
		}else {
			System.out.println("같은 학생이 아니다.");
		}
	}	
}
