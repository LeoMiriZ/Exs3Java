package pacote2;

import java.util.Scanner;
import java.util.Stack;

public class Resolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		String exp;

		System.out.println("Insira a expressão, em notação polonesa: ");
		exp = teclado.nextLine();
		
		System.out.println("Resultado: " + calcular(exp));

	}
	
	
	public static double calcular (String exp) {
		
		Stack<Double> pilha = new Stack<>();
		
		char ch;
		
		double x, y, res;
		
		for (int i = 0; i < exp.length(); i++) {
			
			ch = exp.charAt(i);
			if(ch != ' ') {
				
				if(ch != '+' && ch != '-' && ch != '*' && ch != '/' && ch != '%') {
					
					pilha.push((double) ch);
					
				} else {
					
					y = pilha.pop();
					
					
				}
				
				
			}
			
		}
		
	}

}
