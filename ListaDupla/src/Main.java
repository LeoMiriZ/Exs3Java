
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lista l = new Lista();
		
		l.inserirInicio(1, "Surian");
		l.inserirInicio(2, "Surjan");
		
		l.inserirfim(3, "Selmini");
		l.inserirfim(4, "Sandra");
		
		l.imprimir();
		
		System.out.println(l.pesquisar(4));

	}

}
