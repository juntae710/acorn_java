package day07;

public class 함수4 {
	
	public static void main(String[] args) {
		a(1);
		b('a');
		c(1);
		d();
		e();
		
		System.out.println(a(1));
		System.out.println(b('a'));
		System.out.println(c(1));
		System.out.println(d());
		System.out.println(e());
	}

	
				//반환타입    //입력정보
	public static int  a( int a ) {
	return a;
	}

	public static int b(char a){
	return 4;
	}
	
	public static char c( int a){
	return 'c';
	}
	
	public static double d( ){
	return 2.5;
	}
	
	public static String e(){
	return "안녕" ;
	}
}
