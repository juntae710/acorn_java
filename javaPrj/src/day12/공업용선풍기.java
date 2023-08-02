package day12;

public class 공업용선풍기 extends 선풍기 {
	public void 공업용선풍기() {
		System.out.println("공업용선풍기");
	}
	@Override
	public void 사이즈() {
		System.out.println("큰사이즈");
	}
	@Override
	public void 전력공급() {
		System.out.println("콘센트연결");
	}
}
