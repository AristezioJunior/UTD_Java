package cursoJava.basico;

/*
 *Classe demonstrativa de variáveis e constantes
 *
 * versão:1.0
 * 
 * autor: Aristézio Júnior
 **/

public class VariaveisEConstantes {

	public static void main(String[] args) {
		
		//Criação de Constante
		final double ACELERACAO_GRAVIDADE_TERRA = 9.8665;
		
		//Criação de variáveis
		String nome="José";
		
		int idade = 48;
		
		double peso = 73.4 , altura=1.73;
		
		char sexo= 'm', cnh='a';
		
		boolean doadorOrgaos= true;
		
		//Imprimindo as variáveis
		
		System.out.println("Nome: "+nome + ", idade: " + idade);
		
		System.out.println("Peso: "+peso + " altura: " + altura);
		
		System.out.println("Sexo: "+sexo + " cnh: " + cnh);
		
		System.out.println("Doador? "+doadorOrgaos);
		
		System.out.println("Gravidade na Terra: "+ ACELERACAO_GRAVIDADE_TERRA);
		
		
		
		

	}

}
