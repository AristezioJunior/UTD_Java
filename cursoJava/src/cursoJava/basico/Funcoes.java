package cursoJava.basico;

/**
 * Classe que exemplifica funções.
 * 
 * Versão:1.0
 * 
 * @author AristezioJunior
 *
 */

public class Funcoes {

	public static void main(String[] args) {
		
		int resultad = soma(10, 60);
		
		System.out.println(resultad);
		
		quadrado(7);
		
		String texto = mensagem();
		
		System.out.println(texto);
		
		olaMundo();
		
		//Operadores Ternário
		
		int nota = 6;
		//comparação se verdadeiro 1 parte, se falso 2 parte.
		String resultado = nota>=7?"Você foi aprovado": "Você ficou de recuperação";
		
		System.out.println(resultado);
		
	}
	//FUNÇÕES
	
	//função com retorno tipo int e com parametros
	static int soma(int a, int b) {
		
		return a + b;		
	}
	//void significa que nao tem retorno
	static void quadrado(int numero) {
		System.out.println(numero*numero);
	}
	
	//não recebe parametro e retorna alguma coisa
	static String mensagem() {
		return "Aqui é a função sem parametro.";
	}
	
	//não tem parametro e não retorna nada
	static void olaMundo() {
		System.out.println("Ola Mundo!");
	}
	
	
}
