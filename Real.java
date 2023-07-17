package escola;

public class Real extends Moeda {

	public Real(double valor) { //construtor da classe filha Real
		super(valor); //heranca da classe mae Moeda
	}
	
	public void info() {}; //metodo publico info

	@Override
	double converter() { //metodo publico de conversao de Moeda para Real
		double total = valor; //como Moeda eh o proprio Real o valor informado eh o proprio total
		return total; // retorna este valor quando invoca-se o metodo
	}

	@Override
	public String toString() { //possibilita que seja impresso o valor guardado na posicao de memoria e nao a posicao da memoria
		return "Real [valor=" + valor + "]";
	}
	
}
