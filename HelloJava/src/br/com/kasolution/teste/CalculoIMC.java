package br.com.kasolution.teste;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------PROGRAMA PARA CALCULAR O IMC--------");
		System.out.println("Informe o seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Informe o seu peso: ");
		double peso = sc.nextDouble();
		System.out.println("Informe sua altura: ");
		double altura = sc.nextDouble();
		
		Double imc = peso/(altura * altura);
		
		System.out.printf("Indice de massa corporal da paciente %s e igual a: %.2f",nome ,imc);
		
	}

}
