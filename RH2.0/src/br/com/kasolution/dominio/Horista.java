package br.com.kasolution.dominio;

import br.com.kasolution.util.Formatador;

public class Horista extends Funcionario{ //herança de funcionario
	
	//herda nome sobrenome e cpf
	private double valorHora;
	private double horasTrabalhadas;
	
	public Horista() {

	}

	public Horista(String nome, String sobrenome, String cpf, double valorHora, double horasTrabalhadas) {
		super(nome, sobrenome, cpf); //envia para a classe base
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	@Override
	public String toString() {
		
		String info = super.toString();
		info += "Valor hora: " + Formatador.moeda(valorHora) + "\n";
		info += "Horas Trabalhadas: " + Formatador.numero(horasTrabalhadas) + "\n";
		return info;
		
	}

	@Override
	public double calculaValorPagamento() {
		return valorHora * horasTrabalhadas;
	}


	
	
	
	
}
