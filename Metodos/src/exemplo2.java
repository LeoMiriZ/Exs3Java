import java.util.Scanner;

public class exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = new int[5];

		preencher(x);
		System.out.println("soma = " + somar(x));

	}

	public static void preencher(int[] x) {

		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < x.length; i++) {
			System.out.println("Valor--> ");
			x[i] = teclado.nextInt();

		}

	}

	public static int somar(int[] x) {

		int resultado = 0;
		for (int i = 0; i < x.length; i++) {
			resultado += x[i];
		}

		return resultado;

	}
}
