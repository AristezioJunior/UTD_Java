package cursoJava.basico;

/**
 * Classe explicativa sobre Estrutura de Repeti��o
 * 
 * Vers�o: 1.0
 * 
 * @author AristezioJunior
 *
 */


public class EstruturasDecisao {

	public static void main(String[] args) {

		//String texto = 10 == 7? "Verdadeiro" : "falso";
		
		//System.out.println(texto);
		
		int idade = 19;
		
		if(idade >= 18) {
			System.out.println("J� pode tirar a CNH.");
		}else {
			System.out.println("N�o tem idade para tirar a CNH.");
		}
		
		String semafaro = "verde";
		
		if(semafaro == "verde") {
			System.out.println("Siga em frente.");
		} else if(semafaro == "amarelo") {
			System.out.println("Aten��o");
		}else if(semafaro == "vermelho"){
			System.out.println("Pare");
		}else {
			System.out.println("Chame a aut�rquia de tr�nsito");
		}
		
		
		System.out.println("------------------------------");
		
		char opcao = 'b';
		
		switch(opcao) {
			case 'a': System.out.println("Cadastrar produto"); break;
		
			case 'b': System.out.println("Visualizar detalhes"); break;
		
			case 'c': System.out.println("Editar produto"); break;
		
			case 'd': System.out.println("Deletar produto"); break;
			
			default: System.out.println("Op��o inv�lida"); ;		
		}
		
		
		
		
		
		
		
	}

}
