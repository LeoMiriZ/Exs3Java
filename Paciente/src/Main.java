import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		Paciente p = new Paciente();

		System.out.println("Nome: ");
		p.nome = teclado.nextLine();

		System.out.println("Idade: ");
		p.idade = teclado.nextInt();

		System.out.println("Frequência máxima: " + p.fmax());
		double[] alvo = p.falvo();
		
		System.out.println("Alvo mínimo: " + alvo[0]);
		System.out.println("Alvo máximo: " + alvo[1]);

	}

}
