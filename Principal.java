package escola;

import java.util.Scanner; // importa a funcionalidade de ler entradas do  sistema

public class Principal {

	public static void main(String[] args) { //inicia o programa
		Scanner teclado = new Scanner(System.in); //instancia a variavel teclado
		int opcao; //cria a variavel opcao que sera utilziada no menu de operacao do cofrinho
		
		Cofrinho cofrinho = new Cofrinho(); //instancia o cofrinho a partir da classe Cofrinho
		
		System.out.println(); //menu do cofrinho com as possiveis operacoes abstraidas nos indices de 0 a 1
		System.out.println("MENU");
		System.out.println("1 - Adicionar moeda");
		System.out.println("2 - Remover moeda");
		System.out.println("3 - Listar moedas");
		System.out.println("4 - Calcular total no cofrinho");
		System.out.println("0 - Encerrar o programa");
		opcao = teclado.nextInt(); //ler o proximo valor inteiro da variavel teclado
		
		int tipoMoeda; //cria a variavel tipo de moeda que pode ser 1 - Real, 2 - Dolar e 3 - Euro
		double valor; // cria a variavel valor como double
		Moeda m = null; // cria a variavel m
		
		while(opcao!=0) { //iterador para que enquanto a opcao for diferente de 0 ocorra um loop para manutencao do menu
			switch(opcao) { //uso do metodo switch
			
			case 1: // adicionar moeda
				tipoMoeda=0;
				while(tipoMoeda>3 || tipoMoeda<=0) { //os valores informados devem estar entre 0 e 3
					System.out.println("Qual moeda deseja adicionar?");
					System.out.println("1 - Real");
					System.out.println("2 - Dolar");
					System.out.println("3 - Euro");
					tipoMoeda = teclado.nextInt(); // realiza a leitura do tipo de moeda
				}
				System.out.println("Qual o valor da moeda que deseja adicionar?");
				valor = teclado.nextDouble(); //solicita o valor da moeda adicionada
				
				if(tipoMoeda==1) { //testa para saber se a moeda eh de Real
					m = new Real(valor); // instancia a moeda m como sendo Real de valor m informado pelo teclado
				}
				if(tipoMoeda==2) { //testa para saber se a moeda eh de Dolar
					m = new Dolar(valor); // instancia a moeda m como sendo Dolar de valor m informado pelo teclado
				}
				if(tipoMoeda==3) { //testa para saber se a moeda eh de Euro
					m = new Euro(valor); // instancia a moeda m como sendo Euro de valor m informado pelo teclado
				}
				
				cofrinho.adicionar(m); //invoca o metodo adicionar da classe Cofrinho e adiciona a listagem de moedas
				
				break;
			
			case 2: // remover moeda
				tipoMoeda=0;
				while(tipoMoeda>3 || tipoMoeda<=0) { //os valores informados devem estar entre 0 e 3
					System.out.println("Qual moeda deseja remover?");
					System.out.println("1 - Real");
					System.out.println("2 - Dolar");
					System.out.println("3 - Euro");
					tipoMoeda = teclado.nextInt(); // realiza a leitura do tipo de moeda
				}
				System.out.println("Qual o valor da moeda que deseja remover?");
				valor = teclado.nextDouble(); //solicita o valor da moeda retirada
				
				if(tipoMoeda==1) { //testa para saber se a moeda eh de Real
					m = new Real(valor); // instancia a moeda m como sendo Real de valor m informado pelo teclado
				}
				if(tipoMoeda==2) { //testa para saber se a moeda eh de Dolar
					m = new Dolar(valor); // instancia a moeda m como sendo Dolar de valor m informado pelo teclado
				}
				if(tipoMoeda==3) { //testa para saber se a moeda eh de Euro
					m = new Euro(valor); // instancia a moeda m como sendo Euro de valor m informado pelo teclado
				}
				
				cofrinho.remover(m); // invoca o metodo remover da classe Cofrinho e remove o objeto da listagem de moedas
				
				break;
				
			case 3:
				cofrinho.listagemMoedas(); //invoca o metodo listagemMoedas e apresenta a lista de moedas
				
				break;
				
			case 4:
				cofrinho.totalCovertido(); // apresenta a soma das moedas no cofrinho pelo cambio de hoje, 17-07-23
				break;
				
			default:
				System.out.println("Opcao Invalida!"); // Informa que o valor digitado eh invalido
			}
			
			System.out.println();
			System.out.println("MENU");
			System.out.println("1 - Adicionar moeda");
			System.out.println("2 - Remover moeda");
			System.out.println("3 - Listar moedas");
			System.out.println("4 - Calcular total no cofrinho");
			System.out.println("0 - Encerrar o programa");
			opcao = teclado.nextInt();
			
		}
	}

}
