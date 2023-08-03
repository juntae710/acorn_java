package day03;

public class 제어문switch {

	public static void main(String[] args) {
		int menu=1;
		
		switch(menu) {
		case 1:
			System.out.println("등록을 선택하셨어요.");
			break;
		case 2:
			System.out.println("변경을 선택하셨어요.");
			break;
		case 3:
			System.out.println("삭제을 선택하셨어요.");
			break;
		case 4:
			System.out.println("조회을 선택하셨어요.");
			break;
		default:
			System.out.println("다시 선택해주세요.");
	}

}
}