package br.com.kasolution.teste;

import br.com.kasolution.dominio.Assalariado;
import br.com.kasolution.dominio.Comissionado;
import br.com.kasolution.dominio.ComissionadoAssalariado;
import br.com.kasolution.dominio.Funcionario;
import br.com.kasolution.dominio.Horista;
import br.com.kasolution.util.Formatador;

public class TesteFuncionario01 {

	public static void main(String[] args) {

		//Funcionario f = new Funcionario("Joao", "de Deus", "333.333.333-22");
		
		Horista h = new Horista("Ari", "Junior", "111.222.333-22", 200.00, 100);
		
		Assalariado a = new Assalariado("Ana", "Luiza", "333.222.111-99", 300.00);
		
		Comissionado c = new Comissionado("Alice", "Rosa", "423.222.111-44", 500.00, 50);
		
		ComissionadoAssalariado ca = new ComissionadoAssalariado("Maria", "Lourdes", "784.222.333-44", 1_000.00, 40, 1_000);
		
		Funcionario funcionarios[] = {h,a,c,ca};
		
		for (Funcionario x : funcionarios) {
			System.out.println(x.getClass().getSimpleName());
			System.out.println(x.toString());
			System.out.println("Valor Pagamento" +Formatador.moeda(x.calculaValorPagamento()));
			System.out.println("\n");
		}
		
		/*System.out.println("Funcionario: ");
		System.out.println(f.toString());
		
		System.out.println("\nHorista : ");
		System.out.println(h.toString());
		
		System.out.println("\nAssalariado : ");
		System.out.println(a.toString());
		
		System.out.println("\nComissionado : ");
		System.out.println(c.toString());
		
		System.out.println("\nComissionado Assalariado: ");
		System.out.println(ca.toString());*/
		
		
	}

}
