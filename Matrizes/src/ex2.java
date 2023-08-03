import java.util.Random;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random gerador = new Random();

		int[][] x = new int[10][10];

		for (int i = 0; i < x.length; i++) {

			for (int j = 0; j < x[i].length; j++) {

				x[i][j] = gerador.nextInt(0, 10);
				System.out.print(x[i][j] + "\t");

			}
			
			System.out.println();
		}

	}

}
