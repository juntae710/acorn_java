package day13.String;

public class Ex01 {

	public static void main(String[] args) {
		
		//문자열을 생성하는 방법 2가지
		
		//한번 생성됨니다.
		//정적영역(상수영역에 생성됨)
		//같은 문자열을 사용할 때는 별도의 공간을 확보하는 것이 아니라
		//래퍼런스 (주소)만 제공받습니다.
		String srt0 ="hello";	//모두다 100번지
		String srt1 ="hello";
		//문자열 수정 불가
		
		
		//2개 각 각 생성됩니다.
		// heap 메모리에 각각 생성됨
		String srt2 =new String("hello"); //200번지
		String srt3 =new String("hello"); //300번지
		//문자열 수정 불가 (final char[] value)
		
		
		
		
	}

}
