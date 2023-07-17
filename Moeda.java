package escola;

public abstract class Moeda { //classe mae abstrata
	double valor; // valor que sera lido nas classes filhas
	
	public Moeda(double valor) { //construtor da classe Moeda
		super();
		this.valor = valor;
	}
	
	public abstract void info(); //metodo publico abstrato info
	
	abstract double converter(); //metodo publico abstrato converter

	@Override
	public boolean equals(Object obj) { //metodo que possibilita a comparacao dos objetos, a fim de garantir que estes sejam removidos, quando solicitados.
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

}
