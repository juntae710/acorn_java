package day11;

public class 쇼핑몰 {

	private int 주문번호;
	private String 주문자아이디;
	private String 주문날짜;
	private String 주문자이름;
	private String 주문상품번호;
	private String 배송주소;

	public 쇼핑몰(int 주문번호, String 주문자아이디, String 주문날짜, String 주문자이름, String 주문상품번호, String 배송주소) {

		this.주문번호 = 주문번호;
		this.주문자아이디 = 주문자아이디;
		this.주문날짜 = 주문날짜;
		this.주문자이름 = 주문자이름;
		this.주문상품번호 = 주문상품번호;
		this.배송주소 = 배송주소;
	}

	public 쇼핑몰() {
	}

	public String toString() {
		return "주문번호:" + 주문번호 + " 주문자아이디:" + 주문자아이디 + " 주문날짜:" + 주문날짜 + " 주문자이름:" + 주문자이름 + " 주문상품번호:" + 주문상품번호
				+ " 배송주소:" + 배송주소;
	}

}
