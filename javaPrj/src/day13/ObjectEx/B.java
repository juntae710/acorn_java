package day13.ObjectEx;

public class B {
	int number;
	@Override
	public String toString() {
		return number+"입니다.";
	}
	
	@Override
	public boolean equals( Object obj) {
		boolean result= false;
		B b= (B)obj; //다운케스팅
		
		if (this.number==b.number)
			result = true;
			
		return result;
	}
	
	public B(int number) {
		super();
		this.number = number;
	}
	public B() {
		// TODO Auto-generated constructor stub
	}

}
