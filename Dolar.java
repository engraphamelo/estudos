package escola;

public class Dolar extends Moeda {

	public Dolar(double valor) { //construtor da classe filha Dolar
		super(valor); //heranca da classe mae Moeda
	}
	
	public void info() {}; //metodo publico info

	@Override
	double converter() { //metodo publico de conversao de Dolar para Real
		double total = 4.83 * this.valor; //cotacao do dolar em 17 de julho de 2023
		return total;
	}

	@Override
	public String toString() { //possibilita que seja impresso o valor guardado na posicao de memoria e nao a posicao da memoria
		return "Dolar [valor em Dolar=" + valor + ", Valor em BRL=" + converter() + "]";
	}

}
