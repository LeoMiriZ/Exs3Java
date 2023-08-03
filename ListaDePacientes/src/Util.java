import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;

public class Util {

	private Lista<Paciente> lista = new Lista<>();

	public void menu() {

		int opcao;

		do {

			opcao = parseInt(showInputDialog(gerarMenu()));
			if (opcao < 1 || opcao > 5) {

				showMessageDialog(null, "Opção inválida");
			} else {

				switch (opcao) {

				case 1:
					cadastrar();
					break;
				case 2:
					pesquisar();
					break;
				case 3:
					remover();
					break;
				case 4:
					listar();
					break;

				}
			}

		} while (opcao != 5);

	}

	private String gerarMenu() {

		String aux = "";

		aux += "1. Cadastrar\n";
		aux += "2. Pesquisar\n";
		aux += "3. Remover\n";
		aux += "4. Listar\n";
		aux += "5. Finalizar";
		return aux;

	}
	

	public void cadastrar() {

		String nome;
		int idade;
		double altura, peso, quadril;

		nome = showInputDialog("Insira seu nome");
		idade = parseInt(showInputDialog("Insira sua idade"));
		altura = parseDouble(showInputDialog("Insira sua altura(m)"));
		peso = parseDouble(showInputDialog("Insira seu peso(kg)"));
		quadril = parseDouble(showInputDialog("Insira a medida de seu quadril(cm)"));
		
		lista.inserirfim(new Paciente(nome, peso, altura, quadril, idade));

	}
	
	public void pesquisar() {
		
		String nome = showInputDialog("Nome para pesquisa");
		
		if(lista.pesquisar(new Paciente(nome)) == null) {
			
			showMessageDialog(null, nome + " não é paciente");
		} else {
			
			showMessageDialog(null, nome + " é paciente");
		}
		
	}
	
	public void remover() {
		
		String nome = showInputDialog("Nome para remoção");
		
		if (lista.remover(new Paciente(nome))) {
			
			showMessageDialog(null, nome + " excluído com sucesso");
		} else {
			
			showMessageDialog(null, "Erro na remoção de paciente");
		}

		
	}
	
	public void listar() {
		
		showMessageDialog(null, lista.imprimir());
		
	}

}
