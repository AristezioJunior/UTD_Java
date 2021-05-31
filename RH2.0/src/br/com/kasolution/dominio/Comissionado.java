package br.com.kasolution.dominio;

import br.com.kasolution.util.Formatador;

public class Comissionado extends Funcionario{

	private double vendaBruta;
	private double porcentagemComissao;
	
	public Comissionado() {

	}

	public Comissionado(String nome, String sobrenome, String cpf, double vendaBruta, double porcentagemComissao) {
		super(nome, sobrenome, cpf);
		this.vendaBruta = vendaBruta;
		this.porcentagemComissao = porcentagemComissao;
	}

	public double getVendaBruta() {
		return vendaBruta;
	}

	public void setVendaBruta(double vendaBruta) {
		this.vendaBruta = vendaBruta;
	}

	public double getPorcentagemComissao() {
		return porcentagemComissao;
	}

	public void setPorcentagemComissao(double porcentagemComissao) {
		this.porcentagemComissao = porcentagemComissao;
	}

	@Override
	public String toString() {
		String info = super.toString();
		info += "Venda bruta: " + Formatador.moeda(vendaBruta) + "\n";
		info += "% Comissao: " + Formatador.numero(porcentagemComissao) + "%\n";
		return info;
	}
	
	@Override
	public double calculaValorPagamento() {
		return vendaBruta * (porcentagemComissao/100);
	}
	
	
	
	
	
	
}
