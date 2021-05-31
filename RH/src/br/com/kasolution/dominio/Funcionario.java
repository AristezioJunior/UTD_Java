package br.com.kasolution.dominio;

public class Funcionario {
	
	private final double MINIMO_SALARIO = 1_200.00;
	
	static private int ultimoCodigo;
	
	private int codigo;
	private String nome;
	private String cpf;
	private String setor;
	private double salario;
	

	
	public Funcionario(String nome, String cpf) {
		this.codigo = ++ultimoCodigo;
		this.nome = nome;
		this.cpf = cpf;
		this.salario = MINIMO_SALARIO;
		
	}
	//sobrecarga de construtor
	public Funcionario( String nome, String cpf, double salario) {
		this.codigo = ++ultimoCodigo;
		this.nome = nome;
		this.cpf = cpf;
		if(salario < MINIMO_SALARIO) {
		this.salario = MINIMO_SALARIO;
		} else {
			this.salario = salario;
		}
		
	}

	public int getCodigo() {
		return codigo;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}


	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public double getSalario() {
		return salario;
	}

	public void aumentaSalario(double valor) {
		if(valor > 0) {
		salario += valor;
		}
	}
	
	
	
	
}
