package day15.정렬;

import day15.arr.MyComparator;

public class MyArrays {

	public static void sort(Object[] obj, MyComparator c) {
		for (int i = 0; i < obj.length - 1; i++) {
			for (int j = i + 1; j < obj.length; j++) {
				if (c.compare(obj[i], obj[j]) > 0) {
					Object tmp;
					tmp = obj[i];
					obj[i] = obj[j];
					obj[j] = tmp;
				}
			}
		}

	}
	
	
	public static void sort(Object[] obj) {
		for (int i = 0; i < obj.length - 1; i++) {
			for (int j = i + 1; j < obj.length; j++) {
				MyComparable m = (MyComparable) obj[i];
				if (m.compareTo(obj[j])>0) {
					Object tmp;
					tmp = obj[i];
					obj[i] = obj[j];
					obj[j]=tmp;
				}
			}
		}

	}
}
