import java.util.Random;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random gerador = new Random();

		int[][] x = new int[4][4];
		int aux;
		
		System.out.println("Antes da troca: ");
		for (int i = 0; i < x.length; i++) {

			for (int j = 0; j < x.length; j++) {

				x[i][j] = gerador.nextInt(0, 50);
				System.out.print(x[i][j] + "\t");
			}

			System.out.println();
		}

		for (int i = 0, j = x.length - 1; i < x.length; i++, j--) {

			aux = x[i][i];
			x[i][i] = x[i][j];
			x[i][j] = aux;

		}
		System.out.println("\nDepois da troca: ");
		for (int i = 0; i < x.length; i++) {

			for (int j = 0; j < x.length; j++) {

				System.out.print(x[i][j] + "\t");
			}

			System.out.println();
		}

	}

}
