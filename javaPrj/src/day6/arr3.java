package day6;

public class arr3 {

	public static void main(String[] args) {
		String[][] icecream = {
			{"죠스바","스크류바","돼지바"},
			{"월드콘","구구","브라보"},
			{"붕어싸만코","빵또아","빵빠레"}
		};
//		System.out.println(icecream[0][0]);
//		System.out.println(icecream[0][1]);
//		System.out.println(icecream[0][2]);
//		System.out.println(" ");
//		System.out.println(icecream[1][0]);
//		System.out.println(icecream[1][1]);
//		System.out.println(icecream[1][2]);
//		System.out.println(" ");
//		System.out.println(icecream[2][0]);
//		System.out.println(icecream[2][1]);
//		System.out.println(icecream[2][2]);
		
		for(int i=0; i<icecream.length; i++) {
			for(int j=0; j<icecream[i].length; j++) {
				System.out.println(icecream[i][j]);
			}
		}
	}
}
