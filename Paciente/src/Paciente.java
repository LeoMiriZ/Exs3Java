
public class Paciente {
	
	String nome;
	int idade;
	
	
	//m�todo para calcular e retornar a frequ�ncia m�xima
	
	public int fmax () {
		
		return 220 - idade;
		
	}
	
	// m�todo para calcular e retornar a frequ�ncia m�xima
	
	public double [] falvo () {
		
		double[] alvo = new double [2];
		
		alvo[0] = fmax() * 0.5;
		alvo[1] = fmax() * 0.85;
		return alvo;
	}
	

}
