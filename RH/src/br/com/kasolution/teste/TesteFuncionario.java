package br.com.kasolution.teste;

import br.com.kasolution.dominio.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {

		
		Funcionario funcionario = new Funcionario("Francisco Carlos", "111.222.333-44");
		//Funcionario funcionario2 = new Funcionario();
		
		//funcionario.setCodigo(1);
		//funcionario.setNome("Aristezio Junior"); 
		//funcionario.setCpf("111.333.444-00");
		funcionario.setSetor("TI");
		//funcionario.setSalario(25_000.00);
		funcionario.aumentaSalario(2000.00);
		
		
		System.out.println(funcionario.getCodigo());
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getCpf());
		System.out.println(funcionario.getSetor());
		System.out.println(funcionario.getSalario());
		System.out.println("\n");
		
		Funcionario funcionario2 = new Funcionario("ARISTEZIO JUNIOR", "222.333.444-55", 4_500.00);
		funcionario2.setSetor("TI- Desenvolvedor");
		
		System.out.println(funcionario2.getCodigo());
		System.out.println(funcionario2.getNome());
		System.out.println(funcionario2.getCpf());
		System.out.println(funcionario2.getSetor());
		System.out.println(funcionario2.getSalario());
		
		Funcionario funcionario3 = new Funcionario("ANA LUIZA ", "222.233.344-33", 3_500.00);
		funcionario3.setSetor("TI- Desenvolvedor");
		
		System.out.println(funcionario3.getCodigo());
		System.out.println(funcionario3.getNome());
		System.out.println(funcionario3.getCpf());
		System.out.println(funcionario3.getSetor());
		System.out.println(funcionario3.getSalario());
		
	}

}
