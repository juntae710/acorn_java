package javaPrj.프로젝트;

public class 대림도서관 extends now도서관 {
	// 이름, 주소, 운영시간, 휴관일, 대여권수, 대여일수, 전화번호
	@Override
	public void 이름() {
		System.out.println("이름 : 대림도서관");
	}

	@Override
	public void 주소() {
		System.out.println("주소 : 영등포구 도신로 27");
	}

	@Override
	public void 운영시간() {
		System.out.println("운영시간 : 평일 09:00~22:00\n주말 09:00~17:00");
	}

	@Override
	public void 전화번호() {
		System.out.println("전화번호 : 02-828-3700");
	}
}
