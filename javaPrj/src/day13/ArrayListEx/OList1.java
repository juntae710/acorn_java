package day13.ArrayListEx;

public class OList1 {

	private Object[] nums;
	private int current;

	public OList1() {
		nums = new Object[3];
		current = 0;
	}

	public int size() {
		return current;
	}

	public void add(Object obj) {

		nums[current] = obj;
		current++;

	}

	public void clear() {
		// current 초기화
		current = 0;
		// nums= new int[3];
	}

	public Object get(int index) {

		return nums[index];

	}

	public static void main(String[] args) {

		OList1 list = new OList1();

		list.add(new Score("이정훈", 99, 100));
		list.add(new Score("이윤정", 99, 100));
		list.add(new Score("이윤", 99, 100));

		for(int i=0; i< list.size(); i++) {
			System.out.println( list.get(i));
		}

	}
}
