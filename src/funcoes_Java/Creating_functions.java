// Criando nossas próprias funções

/*
 * Faça um porgrama que o usuário informe a quantidade que ele quiser de frutas,
 * que ele digite as frutas que ele quer, e depois seja informada as frutas que ele
 * digitou em ordem inversa
 */


package funcoes_Java;

import java.util.Scanner;

public class Creating_functions {
	
	static String frutas[];
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int qtd;
		
		System.out.println("Informe a quantidade de frutas que você quer cadastrar.");
		qtd = Integer.parseInt(teclado.nextLine());
		
		cadastrar_dados(qtd);
		mostrar_dados(qtd);
		
		teclado.close();
	}
	/*
	 * Uma função deve ter o seguinte:
	 * a) Tipo de retorno (Tipo de dado que a função vai retornar);
	 * b) Nome -> Corresponde a ação que a função vai realizar
	 * c) Parâmetros/Argumentos de entrada
	 * d) Retorno (Opcional - depende do tipo do retorno);
	 */
	static void cadastrar_dados(int quantidade) {
		frutas = new String[quantidade];
			for (int i = 0; i < quantidade; i++) {
				System.out.println("Informe a " + (i + 1) + "a. fruta.");
				frutas[i] = teclado.nextLine();
			}
	}
	
	static void mostrar_dados(int quantidade) {
		for (int i = quantidade - 1; i >= 0; i--) {
			System.out.println(frutas[i]);
		}
	}
}
