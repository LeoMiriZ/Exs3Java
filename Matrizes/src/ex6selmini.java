import java.util.Random;
import java.util.Scanner;

public class ex6selmini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int linha_a, coluna_a;
		int linha_b, coluna_b;

		System.out.println("Total de linhas da matriz A--> ");
		linha_a = teclado.nextInt();

		System.out.println("Total de colunas da matriz A--> ");
		coluna_a = teclado.nextInt();

		linha_b = coluna_a;

		System.out.println("Total de colunas da matriz B--> ");
		coluna_b = teclado.nextInt();

		int[][] a = new int[linha_a][coluna_a];
		int[][] b = new int[linha_b][coluna_b];
		int[][] c = new int[linha_a][coluna_b];

		preencher(a);

		System.out.println("Matriz A:");
		imprimir(a);

		preencher(b);

		System.out.println("\nMatriz B:");
		imprimir(b);
		
		multiplicar (a,b,c);
		
		System.out.println("\nMatriz C:");
		imprimir (c);
	}

	public static void preencher(int[][] m) {

		Random gerador = new Random();

		for (int i = 0; i < m.length; i++) {

			for (int j = 0; j < m[i].length; j++) {

				m[i][j] = gerador.nextInt(1, 4);
			}
		}

	}

	public static void imprimir(int[][] m) {

		for (int i = 0; i < m.length; i++) {

			for (int j = 0; j < m[i].length; j++) {

				System.out.print(m [i] [j] + "\t");
			}
			
			System.out.println();
		}

	}
	
	public static void multiplicar (int [] [] a, int [] [] b, int [] [] c) {
		
		int soma;
		for (int i = 0; i < a.length; i++) {
			
			for (int k = 0; k < b[0].length; k++) {
				soma = 0;
				
				for(int j = 0; j < b.length; j++) {
					
					soma += a[i] [j] * b[j] [k];
				}
				
				c [i][k] = soma;
			}
		}
	}
}
