package br.gov.cesarschool.poo.fidelidade.cliente.entidade;

import java.util.Date;

import br.gov.cesarschool.poo.fidelidade.geral.entidade.Endereco;
import br.gov.cesarschool.poo.fidelidade.geral.entidade.Sexo;

public class Cliente {
	private String cpf;
	private String nomeCompleto;
	private Sexo sexo;
	private Date dataNascimento;
	private double renda;
	private Endereco endereco;

	public Cliente(String cpf, String nomeCompleto, Sexo sexo, Date dataNascimento, double renda, Endereco endereco) {
		super();
		this.cpf = cpf;
		this.nomeCompleto = nomeCompleto;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.renda = renda;
		this.endereco = endereco;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}
	
	public int obterIdade() {
		Date dataAtual = new Date();
		int idade = dataAtual.getYear() - dataNascimento.getYear();
		if (dataAtual.getMonth() < dataNascimento.getMonth()
				|| dataAtual.getMonth() == dataNascimento.getMonth()
				&& dataAtual.getDate() < dataNascimento.getDate()) {
			idade --;
		}
		return idade;
	}
	
}