import java.util.Random;

public class ex5metodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[][] x = new int[4][4];

		preencher(x);

		System.out.println("Antes da troca: ");

		imprimir(x);
		
		trocar (x);

		System.out.println("\nDepois da troca: ");
		
		imprimir (x);

	}

	public static void preencher(int[][] x) {

		Random gerador = new Random();

		for (int i = 0; i < x.length; i++) {

			for (int j = 0; j < x.length; j++) {

				x[i][j] = gerador.nextInt(0, 50);
			}

		}

	}

	public static void trocar(int[][] x) {

		int aux;

		for (int i = 0, j = x.length - 1; i < x.length; i++, j--) {

			aux = x[i][i];
			x[i][i] = x[i][j];
			x[i][j] = aux;

		}

	}

	public static void imprimir(int[][] x) {

		for (int i = 0; i < x.length; i++) {

			for (int j = 0; j < x.length; j++) {

				System.out.print(x[i][j] + "\t");
			}

			System.out.println();
		}

	}

}
