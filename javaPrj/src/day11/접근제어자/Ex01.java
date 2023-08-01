package day11.접근제어자;

import day11.접근제어자.Test.c;

public class Ex01 {

	public static void main(String[] args) {
		//접근제어자 : 접근에 대한 내용
		//public : 완전 오픈 , private: 내 클래스 안에서만 접근 허용
		// default : (접근에 대해서 명지하지 않으면 )default 접근 제어자를 가진다.
		
		//public : 전체
		//default : 내 폴더
		//private : 내 파일
		
		a.매서드1();
		a.매서드2();
		
		b.매서드1();
		b.매서드2();
		
		//c의 매서드1 , c의 매서드 2의 접근체어자가 생략되었음으로 default 갖는다.
		//c와 같은 폴더안에 있는 클래스들만 접근 허용
		c.매서드1();
		c.매서드2();
		
	}

}
