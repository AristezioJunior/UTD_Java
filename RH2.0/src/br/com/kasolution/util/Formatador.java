package br.com.kasolution.util;

import java.text.NumberFormat;

public class Formatador {

	static public String moeda(double valor) {
		return NumberFormat.getCurrencyInstance().format(valor);
	}
	
	static public String numero(double valor) {
		return NumberFormat.getNumberInstance().format(valor);
	}
	
	
}
