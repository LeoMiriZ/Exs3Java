import static javax.swing.JOptionPane.*;

public class Lista<T> {

	private No<T> inicio, fim;

	private int tamanho;

	// método para inserir um nó no início da lista

	public void inserirInicio(T dado) {

		No<T> aux = new No<>(dado);

		if (tamanho == 0) {

			inicio = aux;
			fim = aux;

		} else {

			aux.dir = inicio;
			inicio.esq = aux;
			inicio = aux;
		}

		tamanho++;

	}

	// método para imprimir os elementos da lista

	public String imprimir() {

		String msg = null;

		No<T> aux = inicio;

		while (aux != null) {

			showMessageDialog(null, aux.dado);
			aux = aux.dir;
		}

		return msg;

	}

	// método para inserir um nó no fim da lista

	public void inserirfim(T dado) {

		No<T> aux = new No<>(dado);

		if (tamanho == 0) {

			inicio = aux;
			fim = aux;

		} else {

			aux.esq = fim;
			fim.dir = aux;
			fim = aux;
		}

		tamanho++;

	}

	// metódo para pesquisar um aluno pelo RA

	public No pesquisar(T dado) {

		No<T> aux = inicio;

		while (aux != null) {

			if (aux.dado.equals(dado)) {

				return aux;

			}

			aux = aux.dir;

		}

		return null;
	}
	
	public String consultar(T dado) {

		No<T> aux = inicio;

		while (aux != null) {

			if (aux.dado.equals(dado)) {

				return aux.dado.toString();

			}

			aux = aux.dir;

		}

		return null;
	}

	// método para remover um nó da lista

	public boolean remover(T dado) {

		boolean retorno = false;

		No<T> aux = pesquisar(dado);

		if (aux != null) {

			if (tamanho == 1) {

				inicio = null;
				fim = null;
				aux = null;

			} else {

				if (aux == inicio) {

					inicio = aux.dir;
					inicio.esq = null;
					aux.dir = null;
					aux = null;

				}

				else if (aux == fim) {

					fim = aux.esq;
					fim.dir = null;
					aux.esq = null;
					aux = null;

				} else {

					aux.esq.dir = aux.dir;
					aux.dir.esq = aux.esq;
					aux.dir = null;
					aux.esq = null;
					aux = null;

				}

			}

			retorno = true;
			tamanho--;

		}

		return retorno;

	}

}
