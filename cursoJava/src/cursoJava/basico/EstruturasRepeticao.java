package cursoJava.basico;

import java.util.Scanner;

/**
 * Classe explicativa sobre Estrutura de Repetição
 * 
 * Versão: 1.0
 * 
 * @author AristezioJunior
 *
 */
public class EstruturasRepeticao {

	public static void main(String[] args) {

		
		boolean flag = true;
		
		Scanner ler = new Scanner(System.in);
		//Estrutura controlada por flag
		//Repete enquanto o teste lógico for verdadeiro
		while(flag) {
			System.out.println("True or false?");
			flag = ler.nextBoolean();
			
		}
		
		int contador = 0;
		//Estrutura controlada por contador
		while(contador<10) {
			System.out.println(contador++);
		}
		
		
		do {
			System.out.println("Repetição passando pelo Do while");
		}while(false);
		
		
		
		
	}

}
