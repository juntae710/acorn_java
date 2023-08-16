package day20.thread;

public class 실습 {

	public static void main(String[] args) {

		// 수행할 코드를 작성해서 인자정보로 넘겨줘야 함
		// Runnable 인터페이스로 약속되어 있음 (void run())
		System.out.println("마을 지도 만들기");
		Thread th1 = new Thread(new Make());

		th1.start();

		Thread th2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println((i + 1) + " bye ^^");
				}
			}

		});

		th2.start();
	}

}
class Make implements Runnable {

	@Override
	public void run() {
		
		for (int i = 1; i <= 100; i++) {
			 try {
				Thread.sleep(1000);
				System.out.println("지도 만드는중...."+"("+i+"%)");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
