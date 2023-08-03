
public class Veiculo {
	
	String placa;
	String marca;
	
	// método construtor para inicializar os atributos
	
	public Veiculo (String placa, String marca) {
		
		this.placa = placa;
		this.marca = marca;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return placa + "\n" + marca;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Veiculo v = (Veiculo) obj;
		if(v.placa.equals(placa)) {
			return true;
		}
		
		return false;
		
	}

}



