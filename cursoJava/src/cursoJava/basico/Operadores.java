package cursoJava.basico;

/*
 * Classe de explicação e demonstração dos operadores
 * 
 * versão: 1.0
 *
 *autor: Aristezio Júnior
 **/

public class Operadores {

	public static void main(String[] args) {

		int numero = 10, numero2 = 8; 
		
		//Operadores aritméticos +  -  *  /  %
		
		int resultado = numero + numero2;
		int resultado1 = numero - numero2;
		int resultado2 = numero * numero2;
		int resultado3 = numero / numero2;
		int resultado4 = numero % numero2;
		
		System.out.println("_______________________________________________________________________");
		System.out.println("OPERADORES ARITMÉTICOS");
		System.out.println("A soma de numero e numero2 é =");
		System.out.println(resultado);
		System.out.println("A subtração de numero e numero2 é =");
		System.out.println(resultado1);
		System.out.println("A mutiplicação de numero e numero2 é =");
		System.out.println(resultado2);
		System.out.println("A divisão de numero e numero2 é =");
		double dividindo = (double)numero / numero2;
		System.out.println("resultado inteiro: "+resultado3 + "   Resultado Real: " + dividindo);
		System.out.println("O modulo de numero e numero2 é =");
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
		System.out.println("Numero é igual de numero2? ");
		System.out.println(numero == numero2);
		System.out.println("Numero é diferente de numero2? " );
		System.out.println(numero != numero2);
		
		System.out.println("_______________________________________________________________________");
		System.out.println("OPERADORES DE RELACIONAMENTO");
		System.out.println("Numero é maior de numero2?+ ");
		System.out.println(numero > numero2);
		System.out.println("Numero é maior ou igual numero2? ");
		System.out.println(numero >= numero2);
		System.out.println("Numero é menor de numero2?+ ");
		System.out.println(numero < numero2);
		System.out.println("Numero é menor ou igual numero2? ");
		System.out.println(numero <= numero2);
		
		System.out.println("_______________________________________________________________________");
		System.out.println("OPERADORES LÓGICOS && - || (BIT A BIT)");
		
		System.out.println("OPERADORES LÓGICOS E- && (BIT A BIT)");
		//System.out.println("falso E falso: " + (false&&false));
		//System.out.println("falso E verdadeiro: " + (false&&true));
		System.out.println("verdadeiro E falso: " + (true&&false));
		System.out.println("verdadeiro E verdadeiro: " + (true&&true));
		
		System.out.println("OPERADORES LÓGICOS OU- || (BIT A BIT)");
		System.out.println("falso OU falso: " + (false||false));
		System.out.println("falso OU verdadeiro: " + (false||true));
		//System.out.println("verdadeiro OU falso: " + (true||false));
		//System.out.println("verdadeiro OU verdadeiro: " + (true||true));
		
		
	}

}
