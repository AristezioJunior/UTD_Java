package cursoJava.basico;

/**
 * Classe explicativa sobre as expressões aritméticas
 * 
 * Versão: 1.0
 * 
 * @author AristezioJunior
 *
 */

public class ExpressoesAritmeticas {

	public static void main(String[] args) {

		//int resultado = (10 + 2) *3 / 2;
		
		//boolean resultado = 27 + 40 > 100-20;
		
		//resultado = 30 == 3*10 && 50 < 15;
		
		double resultado =  Math.pow(2, 10);
		
		System.out.println(resultado);
		
		//BIBLIOTECA MATH (MATEMÁTICA)
		
		System.out.println(Math.abs(-64));// retorna positivo

		System.out.println(Math.ceil(6.1));//arredonda para cima
		
		System.out.println(Math.round(6.1)); //arredonda para o mais proximo
		
		System.out.println(Math.PI);
		
		System.out.println(Math.floorMod(14, 5));
		
		System.out.println(Math.pow(5,2));
		

		
		
	}

}
