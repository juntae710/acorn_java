package day15;

public class CTest {

	public static void main(String[] args) {
		C c = new C();
		try {
			c.매서드(200);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
			System.out.println(e.getMessage());
		} finally {
			//예외가 발생하든 안하든 실행
		}
		System.out.println("정상종료");

	}

}
