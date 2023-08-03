package day13.ArrayListEx;

import day13.성적관리.Score;

public class GList1<T> {

	private Object[] nums;
	private int current;

	public GList1() {
		nums = new Object[3];
		current = 0;
	}

	public void add(T obj) {
		nums[current] = obj;
		current++;

	}

	public void clear() {
		// current 초기화
		current = 0;
		// nums= new int[3];
	}

	public int size() {
		return current;
	}

	public T get(int index) {

		return (T) nums[index];

	}

	private static void main(String[] args) {
		GList1<Score> list = new GList1<>();

		list.add(new Score("이정훈", 99, 100));
		list.add(new Score("이윤정", 99, 100));
		list.add(new Score("이윤", 99, 100));

		Score score = list.get(0);
		String name = score.getName();

		System.out.println(name);

	}

}
