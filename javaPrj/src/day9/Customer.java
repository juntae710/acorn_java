package day9;

public class Customer {
	// 멤버변수
	public String id;
	private String pw;
	private String name;
	private String address;

	// 생성자
	public Customer(String id, String pw, String name, String address) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.address = address;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	// 쎄터
	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// 겟터
	// toString() 고객정보를 출려할 매서드 , 약속되어 있음
	@Override
	public String toString() {
		return "Customer [id=" + id + ", pw=" + pw + ", name=" + name + ", address=" + address + "]";
	}
}
