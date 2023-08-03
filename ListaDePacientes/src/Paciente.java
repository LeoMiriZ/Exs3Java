
public class Paciente {

	private String nome;
	private double peso, altura, quadril;
	private int idade;

	public Paciente(String nome, double peso, double altura, double quadril, int idade) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.quadril = quadril;
		this.idade = idade;
	}

	public Paciente(String nome) {

		this.nome = nome;
	}

	public int frequenciaMaxima() {

		return 220 - idade;

	}

	public double[] frequenciaAlvo() {

		double[] alvo = new double[2];
		alvo[0] = frequenciaMaxima() * 0.5;
		alvo[1] = frequenciaMaxima() * 0.85;
		return alvo;

	}

	public double calcularIMC() {

		double imc;

		imc = (peso) / (altura * altura);

		return imc;

	}

	public double calcularBAI() {

		double bai;

		bai = (quadril) / (altura * Math.sqrt(altura)) - 18;

		return bai;

	}

	// to String()

	@Override
	public String toString() {

		String aux = "";

		aux += "Nome: " + nome + "\n";
		aux += "IMC: " + String.format("%.2f", calcularIMC()) + "\n";
		aux += "BAI: " + String.format("%.2f", calcularBAI()) + "\n";
		aux += "Frequência máxima: " + frequenciaMaxima() + "\n";
		double[] alvo = frequenciaAlvo();
		aux += "Frequência alvo entre " + alvo[0] + " e " + alvo[1] + "\n";
		return aux;

	}

	// equals()

	@Override
	public boolean equals(Object obj) {

		Paciente paciente = (Paciente) obj;
		if (paciente.nome.equalsIgnoreCase(nome)) {

			return true;
		}

		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getQuadril() {
		return quadril;
	}

	public void setQuadril(double quadril) {
		this.quadril = quadril;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
