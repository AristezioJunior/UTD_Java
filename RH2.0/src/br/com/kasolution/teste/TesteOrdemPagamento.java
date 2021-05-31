package br.com.kasolution.teste;

import br.com.kasolution.dominio.Assalariado;
import br.com.kasolution.dominio.Comissionado;
import br.com.kasolution.dominio.ComissionadoAssalariado;
import br.com.kasolution.dominio.Fatura;
import br.com.kasolution.dominio.Funcionario;
import br.com.kasolution.dominio.Horista;
import br.com.kasolution.dominio.Pagavel;
import br.com.kasolution.util.Formatador;

public class TesteOrdemPagamento {

	public static void main(String[] args) {

		
		
		Horista h = new Horista("Ari", "Junior", "111.222.333-22", 200.00, 100);
		
		Assalariado a = new Assalariado("Ana", "Luiza", "333.222.111-99", 300.00);
		
		Comissionado c = new Comissionado("Alice", "Rosa", "423.222.111-44", 500.00, 50);
		
		ComissionadoAssalariado ca = new ComissionadoAssalariado("Maria", "Lourdes", "784.222.333-44", 1_000.00, 40, 1_000);
		
		Fatura fatura = new Fatura("DELL - NoteBook", 5 , 3_000.00);
		
		Pagavel pagaveis[] = {h,a,c,ca, fatura};
		
		System.out.println("Ordem Pagamento");
		
		for(Pagavel p: pagaveis) {
			System.out.printf("Sacador: %s - valor: %s \n", p.getNome(), Formatador.moeda(p.calculaValorPagamento()) );
			
		}
		//Metodos comuns entre funcionario e fatura
		//getNome  e calculaValorPagamento
		// saida criar interface
		

	}

}
