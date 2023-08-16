package day20.thread;

public class Sleep {

	public static void main(String[] args) {
				
		SThread s =new SThread();
		s.start();
		
		SThread2 s2 =new SThread2();
		s2.start();
	}

}
class SThread extends Thread{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			try {
				sleep(100);
				System.out.println((i+1)+" hi ^^");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

class SThread2 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			try {
				sleep(200);
				System.out.println((i+1)+" bye ^^");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}