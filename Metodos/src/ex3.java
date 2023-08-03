import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int val1, val2, val3;

		System.out.println("Insira o primeiro valor--> ");
		val1 = teclado.nextInt();

		System.out.println("Insira o segundo valor--> ");
		val2 = teclado.nextInt();

		System.out.println("Insira o terceiro valor--> ");
		val3 = teclado.nextInt();

		System.out.println("\n" + maior(val1, val2, val3));

	}

	public static int maior(int val1, int val2, int val3) {

		if (val1 > val2 && val1 > val3) {
			return val1;
		}

		if (val2 > val3 && val2 > val1) {
			return val2;
		
		} else {

			return val3;

		}

	}
}
