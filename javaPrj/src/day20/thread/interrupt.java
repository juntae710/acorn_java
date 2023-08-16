package day20.thread;

public class interrupt {

	public static void main(String[] args) {
		
		ThredEx th = new ThredEx();
		th.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//메인이 3초 기다려준다.
		th.interrupt();//interrupt발생시킨다.
		System.out.println("메인 종료");
		
	}

}

class ThredEx extends Thread{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			try {
				sleep(2000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("자고있는데 깨어남");
				return;
			}
			System.out.println((i+1)+" hi ^^");
			
			if (interrupted()) {
				System.out.println("입트럽트 요청 받음");
				return;
			}
		}
	}
	
}