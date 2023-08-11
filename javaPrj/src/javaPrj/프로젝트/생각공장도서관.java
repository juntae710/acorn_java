package javaPrj.프로젝트;

public class 생각공장도서관 extends now도서관{
	// 이름, 주소, 운영시간, 휴관일, 대여권수, 대여일수, 전화번호
	@Override
	public void 이름() {
		System.out.println("이름 : 생각공장도서관");
	}

	@Override
	public void 주소() {
		System.out.println("주소 : 영등포구 문래북로 105");
	}
	
	@Override
	public void 전화번호() {
		System.out.println("전화번호 : 02-2069-1893");
	}
}
