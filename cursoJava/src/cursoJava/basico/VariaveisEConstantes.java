package cursoJava.basico;

/*
 *Classe demonstrativa de vari�veis e constantes
 *
 * vers�o:1.0
 * 
 * autor: Arist�zio J�nior
 **/

public class VariaveisEConstantes {

	public static void main(String[] args) {
		
		//Cria��o de Constante
		final double ACELERACAO_GRAVIDADE_TERRA = 9.8665;
		
		//Cria��o de vari�veis
		String nome="Jos�";
		
		int idade = 48;
		
		double peso = 73.4 , altura=1.73;
		
		char sexo= 'm', cnh='a';
		
		boolean doadorOrgaos= true;
		
		//Imprimindo as vari�veis
		
		System.out.println("Nome: "+nome + ", idade: " + idade);
		
		System.out.println("Peso: "+peso + " altura: " + altura);
		
		System.out.println("Sexo: "+sexo + " cnh: " + cnh);
		
		System.out.println("Doador? "+doadorOrgaos);
		
		System.out.println("Gravidade na Terra: "+ ACELERACAO_GRAVIDADE_TERRA);
		
		
		
		

	}

}
