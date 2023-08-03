import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		double a, b, c, d;

		double[] x = new double[2];

		System.out.println("Insira o valor de a--> ");
		a = teclado.nextDouble();

		System.out.println("Insira o valor de b--> ");
		b = teclado.nextDouble();

		System.out.println("Insira o valor de c--> ");
		c = teclado.nextDouble();

		d = equacao(a, b, c);
		x = resultados(a, b, c, d);

		if (a == 0) {

			System.out.println("Isso não é uma equação do segundo grau!");
		} else {

			System.out.println("Delta = " + equacao(a, b, c));
			System.out.println("x1 = " + x[0]);
			System.out.println("x2 = " + x[1]);

		}

	}

	public static double equacao(double a, double b, double c) {

		double delta;
		delta = b * b - 4 * a * c;
		return delta;

	}

	public static double[] resultados(double a, double b, double c, double d) {

		double[] x = new double[2];

		x[0] = (-b + Math.sqrt(d)) / (2 * a);
		x[1] = (-b - Math.sqrt(d)) / (2 * a);
		return x;

	}

}
