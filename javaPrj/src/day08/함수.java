package day08;

public class 함수 {

	public static void main(String[] args) {
		
		getSum();
	}
	//void 반환값이 없을때 
				//반환타입 함수명()
	public static void getSum() {
		int sum=0;		
		for( int i=1; i<=10 ; i++) {
			sum+=i;
		}		
		System.out.println( sum);
	}

}
