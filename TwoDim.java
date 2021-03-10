
public class TwoDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sale[][] = new int[][] {{12,34,56,789},
									{110,334,567,222}};
		
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<4; j++)
				System.out.println(sale[i][j]);
		}
	}
}
