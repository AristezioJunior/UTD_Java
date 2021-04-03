package cursoJava.basico;


/**
 * Classe explicativa sobre Estrutura de Repetição
 * 
 * Versão: 1.0
 * 
 * @author AristezioJunior
 *
 */
public class EstruturaRepeticaoContinuacao {

	public static void main(String[] args) {
		
		String frutas[] = {"Maçã", "Abacaxi", "Abacate", "Laranja", "Uva"};
		
		for(int x = 0; x<5; x++) {
			
			System.out.println(frutas[x]);
		}
		
		System.out.println("_______________________________________________");
		
		for(String fruta: frutas) {
			System.out.println(fruta);
		}
			
	
	
	
	}

}
