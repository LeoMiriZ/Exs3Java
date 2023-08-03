
public class Paciente {
	
	String nome;
	int idade;
	
	
	//método para calcular e retornar a frequência máxima
	
	public int fmax () {
		
		return 220 - idade;
		
	}
	
	// método para calcular e retornar a frequência máxima
	
	public double [] falvo () {
		
		double[] alvo = new double [2];
		
		alvo[0] = fmax() * 0.5;
		alvo[1] = fmax() * 0.85;
		return alvo;
	}
	

}
