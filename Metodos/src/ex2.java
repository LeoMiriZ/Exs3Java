import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		double valor1, valor2, valor3;
		

		System.out.println("Insira o primeiro valor--> ");
		valor1 = teclado.nextDouble();

		System.out.println("Insira o segundo valor--> ");
		valor2 = teclado.nextDouble();

		System.out.println("Insira o terceiro valor--> ");
		valor3 = teclado.nextDouble();

		if (valor1 > valor2 + valor3 || valor2 > valor1 + valor3 || valor3 > valor1 + valor2) {

			System.out.println("Isso não é um triângulo!");
		} else {
			
			triangulo(valor1, valor2, valor3);
		}
	}


	
	public static void triangulo (double valor1, double valor2, double valor3) {
		
	
	if(valor1 == valor2 && valor2 == valor3) {
		System.out.println("\nEquilátero");
	}
	
	if(valor1 == valor2 && valor2 != valor3 || valor2 == valor3 && valor3 != valor1 || valor3 == valor1 && valor1 != valor2) {
		
		System.out.println("\nIsósceles");
	}
	
	if(valor1 != valor2 && valor2 != valor3 && valor3 != valor1) {
		System.out.println("\nEscaleno");
	}
				
		
	}
}

