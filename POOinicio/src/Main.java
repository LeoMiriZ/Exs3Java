import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		Aluno[] aluno = new Aluno[3];

		// entrada de dados

		for (int i = 0; i < aluno.length; i++) {

			aluno[i] = new Aluno();
			System.out.println("Insira o RA--> ");
			aluno[i].ra = teclado.nextInt();
			teclado.nextLine();
			System.out.print("Nome--> ");
			aluno[i].nome = teclado.nextLine();
			System.out.print("Nota 1 --> ");
			aluno[i].nota1 = teclado.nextDouble();
			System.out.println("Nota 2 --> ");
			aluno[i].nota2 = teclado.nextDouble();
			System.out.println();
		}

		// imprimir o nome do aluno, a média e a situação

		for (int i = 0; i < aluno.length; i++) {
			
			System.out.print(aluno[i].nome + "\t");
			System.out.println(aluno[i].calcularMedia() + "\t");
			System.out.println(aluno[i].situacao());
			System.out.println();
		}
		
		
	}
}
