package escola;

public class Euro extends Moeda {

	public Euro(double valor) { //construtor da classe filha Euro
		super(valor); //heranca da classe mae Moeda
	}
	
	public void info() {}; //metodo publico info

	@Override
	double converter() { //metodo publico de conversao de Euro para Real
		double total = 5.43 * this.valor; //cotacao do euro em 17 de julho de 2023
		return total;
	}

	@Override
	public String toString() { //possibilita que seja impresso o valor guardado na posicao de memoria e nao a posicao da memoria
		return "Euro [valor em Euro=" + valor + ", Valor em BRL=" + converter() + "]";
	}

}
