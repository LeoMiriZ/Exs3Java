import java.util.Random;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		Random gerador = new Random();

		int totvendedor, linhamaiorvenda, linhamenorvenda;
		double total, maiorvenda, menorvenda;

		System.out.print("Total de vendedores--> ");
		totvendedor = teclado.nextInt();

		String[] mes = { "Jan", "Fev", "Mar", "Abr", "Mai", "Jun" };
		double[][] venda = new double[totvendedor][mes.length + 1];

		String[] vendedor = new String[totvendedor];
		
		teclado.nextLine();
		
		for (int i = 0; i < vendedor.length; i++) {
			
			System.out.println("Insira o nome do vendedor #" + (i+1) + " ");
			vendedor[i] = teclado.nextLine();
			
			total = 0;
			for(int j = 0; j < mes.length; j++) {
				
				venda [i] [j] = gerador.nextInt(4);
				total += venda [i][j];
			}
			
			venda [i] [mes.length] = total;
		}
		
		System.out.println("\nTabela de vendas");
		for(int i = 0; i < totvendedor; i++) {
			
			for(int j = 0; j < mes.length; j++) {
				
				System.out.print(String.format("%.2f\t", venda[i][j]));
			}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Total de vendas por vendedor");
		for (int i = 0; i < totvendedor; i++) {
			
			System.out.println(vendedor [i] + " --> R$ " + String.format("%.2f\t", venda[i][mes.length]));
		}
		
		System.out.println();
		System.out.println("Total de vendas por mês--> ");
		for(int j = 0; j < mes.length; j++) {
			total = 0;
			for(int i = 0; i < vendedor.length; i++) {
				
				total += venda [i][j];
			}
			
			System.out.println(mes[j] + " --> R$ " + String.format("%.2f", total));
			
		}
		
		System.out.println();
		System.out.println("Vendedor com a maior venda");
		maiorvenda = Double.MIN_VALUE;
		linhamaiorvenda = 0;
		for(int i = 0; i < totvendedor; i++) {
			
			if(venda[i] [mes.length] > maiorvenda) {
				
				maiorvenda = venda[i] [mes.length];
				linhamaiorvenda = i;
			}
		}
		
		System.out.println(vendedor[linhamaiorvenda]);
		
		System.out.println();
		System.out.println("Vendedor com a menor venda");
		menorvenda = Double.MAX_VALUE;
		linhamenorvenda = 0;
		for(int i = 0; i < totvendedor; i++) {
			
			if(venda[i] [mes.length] < menorvenda) {
				
				menorvenda = venda[i] [mes.length];
				linhamenorvenda = i;
			}
		}
		
		System.out.println(vendedor[linhamenorvenda]);
	}

}
