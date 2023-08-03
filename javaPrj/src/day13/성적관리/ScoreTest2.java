package day13.성적관리;

import java.util.ArrayList;

public class ScoreTest2 {

	public static void main(String[] args) {
		//객체배열
		
		ArrayList list =  new ArrayList();
		
		//학생 등록하기
		
		Score s = new Score("박태민",100,99);
		Score s2 = new Score("박지원",100,99);
		
		list.add(s);
		list.add(s2);
		list.add(new Score("김민지",99,100));
		
		//삭제하기
		System.out.println("학생 정보 삭제하기.");
		int index=1;
		list.remove(index-1);
		
		
		//조회하기
		System.out.println("조회합니다.");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//Object -> toString()
		//Score -> toString() 재정의 했습니다. (오버라이드)
		
		Object obj = new Score("홍길동",100,80); //ok (업캐스팅)
		System.out.println(obj);
		//부모형으로 참조해도 오버라이드된 실체 객체의 매서드가 호출된다.
		
		//김민지 학생 정보 조회하기
		System.out.println("김민지 학생 조회합니다.");
		String searchName="김민지";
		for(int i=0; i<list.size(); i++) {
			Object o = list.get(i);
			String name=((Score)o).getName();
			
			if(name.equals(searchName)) {
				System.out.println(o);
			}
		}
	

	
	
	//박지원 학새의 정보뵨굥하기
		System.out.println("박지원 학생 국어점수 변경.");
	for (int i= 0 ; i<list.size(); i++) {
		Score score = (Score)list.get(i); //다운케스팅
		
		if (score.getName().equals("박지원")) {
			//국어점수 변경
			score.setKor(99);
		}
		
	}
	System.out.println("조회합니다.");
	for(int i=0; i<list.size(); i++) {
		System.out.println(list.get(i));
	}
	
		
	}	
}
