package cursoJava.basico;

/*
 * Classe de explica��o e demonstra��o dos operadores
 * 
 * vers�o: 1.0
 *
 *autor: Aristezio J�nior
 **/

public class Operadores {

	public static void main(String[] args) {

		int numero = 10, numero2 = 8; 
		
		//Operadores aritm�ticos +  -  *  /  %
		
		int resultado = numero + numero2;
		int resultado1 = numero - numero2;
		int resultado2 = numero * numero2;
		int resultado3 = numero / numero2;
		int resultado4 = numero % numero2;
		
		System.out.println("_______________________________________________________________________");
		System.out.println("OPERADORES ARITM�TICOS");
		System.out.println("A soma de numero e numero2 � =");
		System.out.println(resultado);
		System.out.println("A subtra��o de numero e numero2 � =");
		System.out.println(resultado1);
		System.out.println("A mutiplica��o de numero e numero2 � =");
		System.out.println(resultado2);
		System.out.println("A divis�o de numero e numero2 � =");
		double dividindo = (double)numero / numero2;
		System.out.println("resultado inteiro: "+resultado3 + "   Resultado Real: " + dividindo);
		System.out.println("O modulo de numero e numero2 � =");
		System.out.println(resultado4);

		//INCREMENTO E DECREMENTO
		System.out.println("_______________________________________________________________________");
		System.out.println("INCREMENTO E DECREMENTO");

		int valor = 1;
		System.out.println("Incremento: " + valor++);
		System.out.println(valor);
		System.out.println("Incrementado: " + ++valor);
		System.out.println(valor);
		System.out.println("Decremento: " + valor--);
		System.out.println(valor);
		System.out.println("Decrementado: " + --valor);
		System.out.println(valor);
		
		//Incremento ou Decremento por valores x
		
		System.out.println(valor += 10);
		System.out.println(valor -= 10);
		System.out.println(valor *= 10);
		System.out.println(valor /= 10);
		
		
		System.out.println("_______________________________________________________________________");
		System.out.println("OPERADORES DE IGUALDADE");
		System.out.println("Numero � igual de numero2? ");
		System.out.println(numero == numero2);
		System.out.println("Numero � diferente de numero2? " );
		System.out.println(numero != numero2);
		
		System.out.println("_______________________________________________________________________");
		System.out.println("OPERADORES DE RELACIONAMENTO");
		System.out.println("Numero � maior de numero2?+ ");
		System.out.println(numero > numero2);
		System.out.println("Numero � maior ou igual numero2? ");
		System.out.println(numero >= numero2);
		System.out.println("Numero � menor de numero2?+ ");
		System.out.println(numero < numero2);
		System.out.println("Numero � menor ou igual numero2? ");
		System.out.println(numero <= numero2);
		
		System.out.println("_______________________________________________________________________");
		System.out.println("OPERADORES L�GICOS && - || (BIT A BIT)");
		
		System.out.println("OPERADORES L�GICOS E- && (BIT A BIT)");
		//System.out.println("falso E falso: " + (false&&false));
		//System.out.println("falso E verdadeiro: " + (false&&true));
		System.out.println("verdadeiro E falso: " + (true&&false));
		System.out.println("verdadeiro E verdadeiro: " + (true&&true));
		
		System.out.println("OPERADORES L�GICOS OU- || (BIT A BIT)");
		System.out.println("falso OU falso: " + (false||false));
		System.out.println("falso OU verdadeiro: " + (false||true));
		//System.out.println("verdadeiro OU falso: " + (true||false));
		//System.out.println("verdadeiro OU verdadeiro: " + (true||true));
		
		
	}

}
