import java.util.Random;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random gerador = new Random();

		int[][] x = new int[4][4];
		int dp = 0, ds = 0;

		for (int i = 0; i < x.length; i++) {

			for (int j = 0; j < x[i].length; j++) {
				
				x[i][j] = gerador.nextInt(2, 10);
				System.out.print(x[i][j] + "\t");
				
				if (i == j) {
					
					dp += x[i] [j];
				}
		
				if(i + j == x.length - 1) {
					
					ds += x[i] [j];
				}
			}
			
			System.out.println();

		}
		
		System.out.println("\nSoma da diagonal principal--> " + dp);
		System.out.println("\nSoma da diagonal secundária--> " + ds);

	}

}
