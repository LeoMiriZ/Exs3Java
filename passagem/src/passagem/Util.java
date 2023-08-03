package passagem;
import static javax.swing.JOptionPane.*;

import java.util.Random;

import static java.lang.Integer.parseInt;

public class Util {
	
	
	Passagem [] passagem = new Passagem [5];
	
	//método para inserir os dados no array --> entrada de dados
	
	public void inserir () {
		
		Random gerador = new Random();
		
		for (int i = 0; i < passagem.length; i++) {
			
			passagem[i] =  new Passagem();
			passagem [i].numeroPassagem = gerador.nextInt(1000, 9999);
			passagem[i].nomePassageiro = showInputDialog("Nome do passageiro");
			passagem[i].destino = showInputDialog("Destino da viagem");
			passagem[i].idade = parseInt(showInputDialog("Idade"));
		}
		
		
	}
	
	
	
	//método para imprimir os passageiros acima da média de idade
	
	public void imprimir () {
		
		double media1 = 0;
		double media2;
		String aux = "";
		
		for (int i = 0; i < passagem.length; i++) {
			
			media1 += (passagem[i].idade); 
			
		}
		
		media2 = (media1) / (passagem.length);
		
		for (int i = 0; i < passagem.length; i++) {
			
			if (passagem[i].idade > media2) {
				
				aux += passagem[i].nomePassageiro + "\n";
			}
		}
		
		showMessageDialog(null, aux);
		
	}

}
