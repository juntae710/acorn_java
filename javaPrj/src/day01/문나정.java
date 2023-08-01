package day01;

public class 문나정 {
	public static void main(String[] args) {
	double sum=0; //항의 누적합
	int multi=1;// 분모
	int i=1;//힘의 순번 (반복제어 변수)이자 분자
	final int MAX=4;
	int a=-1; //부호를 구할 변수
	
	
	sum += multi; //sum = sum + multi;
	
	while(i<=MAX) {
		i=i+1;
		multi = i * multi;
		sum=sum+(a*(i/(double)multi));
		System.out.println(sum);
		a=-a; // a*-1;
	}
	System.out.println(sum);
	
	
	double result = 3/6.0; // 정수/정수 => 정수
	System.out.println("result=" + result);
	
	
	}
}
