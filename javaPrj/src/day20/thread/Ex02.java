package day20.thread;

public class Ex02 {

	public static void main(String[] args) {
		
		R r= new R();
		Thread t = new Thread(r);
		
		//Thread t = new Thread(new R());  뒤 두줄을 한줄로 만든 것
	
		t.start(); // 스레드 실행 요쳥
		for (int i = 0; i < 100; i++) {
			System.out.println((i + 1) + " hi ^^");
		}
	}

}

class R implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			System.out.println((i + 1) + " bye ^^");
		}

	}

}
