package cursoJava.basico;

/**
 * Classe que exemplifica fun��es.
 * 
 * Vers�o:1.0
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
		
		//Operadores Tern�rio
		
		int nota = 6;
		//compara��o se verdadeiro 1 parte, se falso 2 parte.
		String resultado = nota>=7?"Voc� foi aprovado": "Voc� ficou de recupera��o";
		
		System.out.println(resultado);
		
	}
	//FUN��ES
	
	//fun��o com retorno tipo int e com parametros
	static int soma(int a, int b) {
		
		return a + b;		
	}
	//void significa que nao tem retorno
	static void quadrado(int numero) {
		System.out.println(numero*numero);
	}
	
	//n�o recebe parametro e retorna alguma coisa
	static String mensagem() {
		return "Aqui � a fun��o sem parametro.";
	}
	
	//n�o tem parametro e n�o retorna nada
	static void olaMundo() {
		System.out.println("Ola Mundo!");
	}
	
	
}
