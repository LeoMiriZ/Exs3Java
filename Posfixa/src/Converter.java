import java.util.Scanner;
import java.util.Stack;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		String exp, pos;

		System.out.println("Expressão --> ");
		exp = teclado.nextLine();

		pos = converter(exp);
		
		System.out.println();

		System.out.println(pos);

	}

	private static String converter(String exp) {

		Stack<Character> pilha = new Stack<>();

		String pos = "";

		char ch;

		for (int i = 0; i < exp.length(); i++) {

			ch = exp.charAt(i);

			if (ch != ' ') {

				switch (ch) {

				case ('+'):
				case ('-'):
				case ('*'):
				case ('/'):
				case ('%'):

					while (!pilha.isEmpty() && prioridade(pilha.peek()) >= prioridade(ch)) {

						pos += pilha.pop();

					}

					pilha.push(ch);
					break;

				case '(':

					pilha.push(ch);
					break;

				case ')':
					while (pilha.peek() != '(') {

						pos += pilha.pop();

					}

					pilha.pop();
					break;

				default:
					pos += ch;

				}

			}

		}
		
		while (!pilha.isEmpty()) {
			
			pos += pilha.pop();
			
		}

		return pos;

	}

	public static int prioridade(char ch) {

		int p = 0;

		switch (ch) {

		case '(':

			p = 1;
			break;

		case '+':
		case '-':

			p = 2;
			break;

		case '*':
		case '/':
		case '%':

			p = 3;

		}

		return p;

	}

}
