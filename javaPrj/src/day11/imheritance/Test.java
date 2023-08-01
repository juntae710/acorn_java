package day11.imheritance;

public class Test {

	public static void main(String[] args) {
		Professor p =new Professor();
		p.말하기();
		p.먹기();
		p.걷기();
		p.잠자기();
		p.공부하기();
		p.가르치기();
		
		Student s =new Student();
		s.말하기();
		s.먹기();
		s.걷기();
		s.잠자기();
		s.공부하기();
		
		StudentWorker sw =new StudentWorker();
		sw.말하기();
		sw.먹기();
		sw.걷기();
		sw.잠자기();
		sw.공부하기();
		sw.일하기();
		
		Researcher r =new Researcher();
		r.말하기();
		r.먹기();
		r.걷기();
		r.잠자기();
		r.연구하기();
		
		//상속관계에서 만 가능
		//Student : 부모 (상위)
		//Researcher : 자식 (하위)
		//부모형 참조형 변수로 다룰 수 있다. 상속 관계에서는
		Student m =new Researcher(); //업 캐스팅
		
		//Student으로 다루면 연구하기는 인식안됨.
		//부모형으로 다루면 부모형의 값만큼만 인식한다. (부모형으로 축소된다.)
		//type : 크기, 해석
		
		//다운 캐스팅 , new 된 실체가 중요
		Researcher  m2 = (Researcher)m; 
		
		print (m2);
	}
	//Student형을 매개 변수로 받음
	//하위 계념을 상위형으로 다룰 수 있다.
	public static void print (Student Student) {
		Student.잠자기();
	}

}
