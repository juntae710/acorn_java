package day15;

public class DTest {

	public static void main(String[] args) {
		D d= new D();
		E e = new E();
		// MyRunnble 인터페이스를 구현한 객체를 넘겨줘야함
		d.매서드(e ); // 매개변수로 인터페이스가 있다면 => 인터페이스를 구현한 객체를 인자로 넘겨줘야함
		
		d.매서드(new F()); //익명 객체 , 일회성으로 객체를 생성하고 싶을때
		
		//익명 클래스를 작성 할 수 있다. ( d.매서드(new MyRunnable() {} )
		//익명 클래스작성할때 new 인터페이스이름 (){}'
		d.매서드(new MyRunnable() {

			@Override
			public void run() {
				System.out.println("실행코드");
				for (int i=1; i<=3; i++ ) {
					System.out.println("*");
				}
				
			}});
		
		d.매서드(new MyRunnable() {
			
			@Override
			public void run() {
				System.out.println("실행코드");
				
				for(int i=1; i<=9; i++) {
					System.out.println(9*i);
				}
				
			}
		});
		d.매서드(new MyRunnable() {
			
			@Override
			public void run() {
				System.out.println("호신용품 판매급증!!!!");
				
			}
		});
		//인터페이스를 구현할떄
		//이름이 있는 클래스를 작성 implements 해야함
		//이름이 없는 클래스 (익명클래스) => 상속받아서 클래스를 만들떄만 익명클래스 작성
		
		d.매서드(new MyRunnable() {
			
			@Override
			public void run() {
				System.out.println("나정 코드 실행");
				
			}
		});
		
		d.매서드(new MyRunnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		
	}

}
