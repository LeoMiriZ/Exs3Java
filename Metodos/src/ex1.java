import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int x;

		System.out.println("Insira um número inteiro e positivo--> ");
		x = teclado.nextInt();

		if (x <= 0) {

			System.out.println("Insira um valor válido!");
		} else {

			divisores(x);
		}

	}

	public static void divisores(int x) {

		for (int cont = 1; cont <= x; cont++) {

			if (x % cont == 0) {
				System.out.println(cont);
			}
		}

	}

}