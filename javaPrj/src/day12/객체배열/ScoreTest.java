package day12.객체배열;

public class ScoreTest {

	public static void main(String[] args) {
		Score s = new Score("01",90,90,90);
		Score s1 = new Score("02",90,90,90);
		Score s2 = new Score("03",90,90,90);
		
		//toString 생략가능
		System.out.println(s.toString());
		System.out.println(s1);
		System.out.println(s2);
		
		
		// s, s1,s2와 같이 참보형 변수를 배열로 만든것 !
		//참조형 변수의 기본값은 null
		Score[] arr = new Score[3];
		//아직 Score객체가 만들어지지않음
		
		//String result = arr[0].toString();
		//java.lang.NullPointerException 에러
		
		arr[0] = new Score("01",100,100,100);
		arr[1] = new Score("02",100,100,100);
		arr[2] = new Score("03",100,100,100);
		
		for (Score Score : arr ) {
			System.out.println(Score);
		}
	}

}
