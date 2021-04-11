package cursoJava.orientacaoobjeto;

public class FuncionarioOperacional extends Funcionario implements Gratificacao, Desconto{

	private String setor;
	
	public FuncionarioOperacional() {
		
	}
	
	public FuncionarioOperacional(Long cadastro, String nome, String ocupacao, double salario, String setor) {
		super(cadastro, nome, ocupacao, salario);
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	@Override
	public double participacaoLucro() {
		return this.getSalario() * 1.5;
	}

	@Override
	public double auxilioCreche() {
		return 200.0;
	}

	@Override
	public double auxilioViagem() {
		return 0;
	}

	@Override
	public double fgts() {
		return this.getSalario() * 0.09;
	}

	@Override
	public double valeAlimentacao() {
		return this.getSalario() *0.05;
	}

	@Override
	public double valeTransporte() {
		return this.getSalario() *0.06;
	}

	
	

}
