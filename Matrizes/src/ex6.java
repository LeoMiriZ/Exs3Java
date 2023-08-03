import java.util.Random;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] x = new int[3][3];

		preencher(x);

		System.out.println("\nPrimeira matriz: ");

		imprimir(x);

		int[][] y = new int[3][2];

		preencher2(y);

		System.out.println("\nSegunda matriz: ");

		imprimir(y);

		System.out.println("\nResultado: ");
		
		mult(x, y);

	}

	public static void preencher(int[][] x) {

		Random gerador = new Random();

		for (int i = 0; i < x.length; i++) {

			for (int j = 0; j < x[i].length; j++) {

				x[i][j] = gerador.nextInt(0, 10);
			}

		}

	}

	public static void preencher2(int[][] y) {

		Random gerador = new Random();

		for (int i = 0; i < y.length; i++) {

			for (int j = 0; j < y[i].length; j++) {

				y[i][j] = gerador.nextInt(0, 10);
			}

		}

	}

	public static void imprimir(int[][] x) {

		for (int i = 0; i < x.length; i++) {

			for (int j = 0; j < x[i].length; j++) {

				System.out.print(x[i][j] + "\t");
			}

			System.out.println();
		}

	}

	public static void imprimir2(int[][] y) {

		for (int i = 0; i < y.length; i++) {

			for (int j = 0; j < y[i].length; j++) {

				System.out.print(y[i][j] + "\t");
			}

			System.out.println();
		}

	}

	public static void mult(int x[][], int y[][]) {

		int[][] z = new int[3][2];

		for (int i = 0; i < y.length; i++) {

			for (int j = 0; j < y[i].length; j++) {

				z[0][0] = x[0][0] * y[0][0] + x[0][1] * y[1][0] + x[0][2] * y[2][0];
				z[0][1] = x[0][0] * y[0][1] + x[0][1] * y[1][1] + x[0][2] * y[2][1];
				z[1][0] = x[1][0] * y[0][0] + x[1][1] * y[1][0] + x[1][2] * y[2][0];
				z[1][1] = x[1][0] * y[0][1] + x[1][1] * y[1][1] + x[1][2] * y[2][1];
				z[2][0] = x[2][0] * y[0][0] + x[2][1] * y[1][0] + x[2][2] * y[2][0];
				z[2][1] = x[2][0] * y[0][1] + x[2][1] * y[1][1] + x[2][2] * y[2][1];

				System.out.print(z[i][j] + "\t");

			}

			System.out.println();
		}
	}

}
