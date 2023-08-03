
public class No<T> {
	
	T dado;
	No<T> esq, dir;
	
	public No (T dado) {
		
		this.dado = dado;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return dado.toString();
	}

}
