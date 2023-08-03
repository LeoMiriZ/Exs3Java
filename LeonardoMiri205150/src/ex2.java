import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		String frase;
		String inver = " ";

		System.out.println("Insira uma frase--> ");
		frase = teclado.nextLine();

		inver = inverter(frase, inver);

		System.out.println("\nA frase invertida é:" + inver);

	}

	public static String inverter(String frase, String inver) {

		for (int i = frase.length() - 1; i >= 0; i--) {

			inver += frase.charAt(i);
		}

		return inver;
	}

}
