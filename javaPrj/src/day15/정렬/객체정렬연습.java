package day15.정렬;

public class 객체정렬연습 {
	public static void main(String[] args) {
		Score[] arr = new Score[3];

		arr[0] = new Score("홍길동", 100, 90);
		arr[1] = new Score("김길동", 80, 75);
		arr[2] = new Score("다길동", 75, 85);

		// 정렬전
		for (Score score : arr) {
			System.out.println(score);
		}

		// 정렬후
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].getKor() > arr[j].getKor()) {
					Score tmp;
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("정렬후");
		for (Score score : arr) {
			System.out.println(score);
		}

		// 이름 정렬후
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].getName().compareTo(arr[j].getName()) > 0) { // 비교했을떄 기준이 크면 양수 ,작으면 음수 (사전기준);
					Score tmp;
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("정렬후");
		for (Score score : arr) {
			System.out.println(score);
		}
	}
}
