package day3;

public class 변수 {

	public static void main(String[] args) {
		// 변수 : 메모리 블럭, 기억장소(공간), 기억장소 식별하기 위한 이동
		//변수선언
		//자료형 변수이름
		int a,b; //4byte 기억공간
		
		
		//자료형
		//크기 + 해석방법
		
		//자료형(공간의 크기와 해성을 하는 방법을 제공함)
		//int : 정수형, 4byte  예시)int a; (+- 약 21억)
		
		//byte : 1byte (8bit , 1byte sing  -129~+127)
		//short : 2byte (16bit) -32768 ~ 32767
		//int : 4byte (32bit) -244783648 ~ 2147483647
		//long : 8byte(64bit) 9223372036854775807
		
		//char : 문자형 : 문자 하나를 저장할 수 있는 공간 ,2byte
		//ex) char ch= 'a';  한 문자 '' 사용해서 표현
		//ex) char ch2= '한';
		
		//double : 실수형테이터를 저장할 수 있는 공간 :8byte : 소수이하 15자리
		//float : 4byte 소수이하 7자리  표현
		//ex) double avg = 98.77;
		
		//boolean : 논리형 true (0이 아닌값),false(0인값)
		//ex) boolean flag = true
		
		//리터럴 : 값자체 10,10.3,'a',"hello",true
		//상수영역에 저장
		//크기를 가진다.
		//정수형값 int형 저장
		
		int iNum=334;
		//334라는 값이 상수영역에 저장되는 것
		//iNum 기억장소에 저장되는 것
		
//		long iLong=2200000000;
		//22억 값 상수영역에 저장하는 것에 문제 발생
		long iLong=2200000000L;
		//long형 리터럴값을 표현해야함 : 숫자뒤에 L을 적어 표현해줌
		
		double d= 23.3;
		//23.3 실수형 리터럴이 double형으로 상수 영역에 저장
		//d라는 변수에 저장됨
		
//		float f = 23.3;
		//23.3 상수영역에 저장
		//double형이 float형에 저장될때 문제 발생
		float f1 = 23.3f;
		//float형으로 저장되도록 표현해야함 : 숫자뒤에 f을 적어 표현해줌
		
		char ch='a';
		char ch2='김';
		//한 문자를 저장하기 위한 공간을 확보 할 때 사용하는 자료형
		//' '한 문자를 표현한다.
		// 2 byte 사용
		//" "문자열을 표현
		char[] str ={'i',' ','l','i','k','e',' ','j','a','v','a'};
		char[] str2= new char[11];
		str2[0]='i';
		str2[1]=' ';
		str2[2]='l';
		str2[3]='i';
		str2[4]='k';
		str2[5]='e';
		str2[6]=' ';
		str2[7]='j';
		str2[8]='a';
		str2[9]='v';
		str2[10]='a';
		System.out.print(str2[0]);
		System.out.print(str2[1]);
		System.out.print(str2[2]);
		System.out.print(str2[3]);
		System.out.print(str2[4]);
		System.out.print(str2[5]);
		System.out.print(str2[6]);
		System.out.print(str2[7]);
		System.out.print(str2[8]);
		System.out.print(str2[9]);
		System.out.print(str2[10]);
		
	
		String str3="i like java";
		System.out.println(str3);
		//" "문자열을 표현
		
		char result = str3.charAt(2);
		System.out.println(result);
		

		//논리값을 저장할 수 있는 자료행 boolean, true, false
		boolean flag = true;
		
		if(flag==true) {
			System.out.println("조건이 참입니다.");
		
		if(flag==true) {
			System.out.println("조건이 참입니다.");
		}else {
			System.out.println("조건이 거짓입니다.");
		}
			
	}

	}}
