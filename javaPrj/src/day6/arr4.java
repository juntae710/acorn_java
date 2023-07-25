package day6;

public class arr4 {

	public static void main(String[] args) {
		
		
		int[][] even ={{2,4,6},{8,10,12},{14,16,18}};
		
		
		int[][] odd = new int [3][3];
		odd[0][0]=1;
		odd[0][1]=3;
		odd[0][2]=5;
		
		odd[1][0]=7;
		odd[1][1]=9;
		odd[1][2]=11;
		
		odd[2][0]=13;
		odd[2][1]=15;
		odd[2][2]=17;
		
		for(int i=0; i<even.length; i++) {
			for(int j=0; j<even[i].length; j++) {
				System.out.print(even[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0; i<odd.length; i++) {
			for(int j=0; j<odd[i].length; j++) {
				System.out.print(odd[i][j]+" ");
			}
			System.out.println();
		}

	}
}
