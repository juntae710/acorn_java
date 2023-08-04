package day14.ExceptionEx;

public class Ex02 {

	public static void main(String[] args) {
		
		//예외처리: 예외발생시 대비코드를 장성하는 것
		
		//필수: checked  :반드시 해야하는것
		//선택: unchecked //배열 범위 벗어 났을때 , 0으로 나누기는것. "25번"
		//방법 1개 try{} catch[] 이용
		try {
		//예외가 발생하면 예외 객체가 생성됨
		int[] arr = new int[3];
		arr[3]=50;
		System.out.println(arr[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			//예외가 발생 되었을떄 할일 (코드)
			
			
			
		}
		System.out.println("정상종료");

		
	}

}
