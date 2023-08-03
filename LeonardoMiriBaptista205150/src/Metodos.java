import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class Metodos {

	public static void armazenar() {

		int numcli;

		numcli = parseInt(showInputDialog("Quantos clientes deseja adicionar?"));

		Clientes[] cliente = new Clientes[numcli];

		if (numcli <= 5 && numcli > 0) {

			for (int i = 0; i < cliente.length; i++) {

				cliente[i] = new Clientes();

				cliente[i].nome = showInputDialog("Insira o nome do cliente");
				cliente[i].cpf = showInputDialog("Insira o CPF do cliente");
				cliente[i].tempo = parseInt(showInputDialog("Insira o tempo que o cliente alugou o carro"));

			}

		} else {

			showMessageDialog(null, "Insira um número de clientes válido!");
			return;
		}

		calcular(cliente);
		melhorcli(cliente);
		valtot(cliente);

	}

	public static void calcular(Clientes[] cliente) {

		double aux;

		for (int i = 0; i < cliente.length; i++) {

			aux = 0.5 * cliente[i].tempo;

			showMessageDialog(null, cliente[i].nome + "\nR$ " + aux);

		}
		
		aux = 0;

	}
	
	public static void melhorcli (Clientes[] cliente) {
		
		int aux = 0;
		String aux1 = "";
		
		aux = cliente[0].tempo;
		aux1 = cliente[0].nome;
		
		for (int i = 0; i < cliente.length; i++) {
			
			if(aux < cliente[i].tempo) {
				
				aux = cliente[i].tempo;
				aux1 = cliente[i].nome;
				
			} else {
				
				aux = aux;
				aux1 = aux1;
			}
		}
		
		
		showMessageDialog(null, "O cliente que mais utilizou a loja foi: " + aux1);
		
		
		
	}
	
	public static void valtot (Clientes[] cliente) {
		
		double aux1 = 0;
		
		for (int i = 0; i < cliente.length; i++) {
			
			aux1 += cliente[i].tempo;
		}
		
		showMessageDialog(null, "Total recebido: R$ " + (aux1 / 2));
		showMessageDialog(null, "Operação finalizada com sucesso!");
		
	}

}
