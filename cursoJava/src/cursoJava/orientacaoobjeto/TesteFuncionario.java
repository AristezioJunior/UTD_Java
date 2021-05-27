package cursoJava.orientacaoobjeto;

public class TesteFuncionario {

	public static void main(String[] args) {

		FuncionarioOperacional funcionario = new FuncionarioOperacional(1L, "Aristézio Júnior", "Programador Júnior", 3200.0, "COTIC");
		
		//FuncionarioOperacional funcionario1 = new FuncionarioOperacional();

//		funcionario1.setCadastro(1L);
//		funcionario1.setNome("Aristezio");
//		funcionario1.setOcupacao("Programador Jr");
//		funcionario1.setSalario(3150.00);
//		
		System.out.println(funcionario.getCadastro());
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getOcupacao());
		System.out.println(funcionario.getSalario());	
		System.out.println(funcionario.getSetor());
		
		//funcionario.verFuncionarios();
		Funcionario.verFuncionarios();
		FuncionarioOperacional.verFuncionarios();
		
	} 

}
