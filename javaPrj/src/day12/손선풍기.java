package day12;

public class 손선풍기 extends 선풍기 {
	public void 손선풍기() {
		System.out.println("손선풍기");
	}
	@Override
	public void 사이즈() {
		System.out.println("작은사이즈");
	}
	@Override
	public void 전력공급() {
		System.out.println("배터리");
	}
}
