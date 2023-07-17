package escola;

import java.util.ArrayList; // importa a funcionalidade ArrayList

public class Cofrinho {
	
		private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>(); // Cria um array vazio para que possa ser criada a colecao de objetos
		private double total;
		
		public void adicionar(Moeda m) { //cria o metodo adicionar
			listaMoedas.add(m);	// adiciona moedas m ao arraylist invocando o  metodo add
	}
		
		public void remover(Moeda m) { // cria o metodo remover
			listaMoedas.remove(m); // retira moedas m do arraylist invocando o metodo remove jah ajustado com o toString()
		}
		
		public void listagemMoedas() { // cria o metodo listagemMoedas
			for(Moeda m : listaMoedas) { // iterador na lista de moedas
				System.out.println(m); //imprime a lista de objetos adicionados na listaMoedas
			}
		}
		public void totalCovertido() { //cria o metodo totalConvertido
			total = 0;
			for(Moeda m: listaMoedas) { //iterador na lista de moedas
				this.total += m.converter(); //realiza a soma dos valores convertidos para cada objeto adicionado a colecao
			}
			System.out.println("Total no cofrinho eh: " + total + " reais."); // informa o valor total no cofrinho
		}

}
