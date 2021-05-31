/**
 * Programa Hello Java
 * Programador: Aristezio Junior
 * data: 24/05/2021
 * 
 */
package br.com.kasolution.teste;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		
		System.out.println("Ola, esse e um programa Java!");
		System.out.println("Qual o seu nome?");
		
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		System.out.println("Ola " + nome + ", seja bem vindo.");
		
		
	}//fim main
	
} // fim classe
