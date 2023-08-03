import java.util.Scanner;
import java.util.Stack;

public class Conversao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Stack<Long> binario = new Stack<>();

		long x;

		System.out.println("Insira um número:");
		x = teclado.nextLong();

		while (x != 0) {

			binario.push(x % 2);

			x = x / 2;

		}

		while(!binario.empty()) {
			
			System.out.print(binario.pop());
			
		}

	}

}
