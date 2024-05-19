package funcoes_Java;

public class More_about_functions {

	public static void main(String[] args) {
		int valor1 = 6, valor2 = 4; // res;
		
		//res = soma(valor1, valor2);
		//System.out.println("O resultado é: " + res);
		
		System.out.println("O resultado é: " + soma(valor1, valor2, "Olá usuário"));
		System.out.println(mensagem());
	}
	
	static int soma(int v1, int v2, String msg) {
		System.out.println(msg);
		return v1 + v2;
	}
	
	static String mensagem() {
		return "Olá novamente, usuário.";
	}
}
