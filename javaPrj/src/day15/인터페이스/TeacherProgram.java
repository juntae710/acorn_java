package day15.인터페이스;

public class TeacherProgram {
	MyRunnable r;

	public void setR(MyRunnable r) {
		this.r = r;
	}

	public void run() {
		r.run();
	}

	public static void main(String[] args) {
		System.out.println("학생들이 작성한 코드를 실행시켜드립니다");
		TeacherProgram p = new TeacherProgram();
		/*
		 * p.setR( new MyRunnable() {
		 * 
		 * @Override public void run() { System.out.println("태민코드 실행합니다"); }} );
		 * 
		 */

		// 익명으로 내용 추가
		p.setR(new MyRunnable() {

			@Override
			public void run() {
				System.out.println("오후부터 시작하는 프로젝트 다들 화이팅이에요! ฅʕ•.•ʔฅ ");

			}
		});
		p.run();

		p.setR(new MinGyu());
		p.run();

		p.setR(new Kjy());
		p.run();
		
		p.setR(new Leeyoon());
		p.run();

		p.setR(new SYJ());
		p.run();
		
		p.setR(new NaJeong());
		p.run();
		
		p.setR(new Ek());
		p.run();
		
		p.setR(new JHStar());
		p.run();

		p.setR(new Taemin());
		p.run();
		
		p.setR(new multi_kdy());
		p.run();
		
		p.setR(new 김민지클래스());
		p.run();
		
		
	}
}
