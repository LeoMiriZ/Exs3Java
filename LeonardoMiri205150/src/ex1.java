import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam = 5;
		int j = 0;
		int[] x = new int[tam];
		int[] y = new int[tam];

		preencher(x, tam);
		preencher(y, tam);
		j = repetir (x,y);
		
		System.out.println("\nO número armazenado na primeira posição do primeiro vetor se repete " + j +  " vezes no segundo vetor.");
				
	}

	public static void preencher(int[] z, int tam) {

		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < z.length; i++) {
			System.out.println("\nInsira os valores dos vetores(" + tam + " em cada) --> ");
			z[i] = teclado.nextInt();
			
		}
		
	}

	public static int repetir(int[] x, int[] y) {

		int j = 0;
		if (x[0] == y[0]) {

			j++;
		}

		if (x[0] == y[1]) {

			j++;
		}

		if (x[0] == y[2]) {

			j++;
		}

		if (x[0] == y[3]) {

			j++;
		}

		if (x[0] == y[4]) {

			j++;
		}
		
		return j;
	}

}
