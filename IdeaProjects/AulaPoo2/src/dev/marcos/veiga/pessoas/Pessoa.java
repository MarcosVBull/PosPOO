package dev.marcos.veiga.pessoas;

import dev.marcos.veiga.telefone.Telefone;
import dev.marcos.veiga.endereco.Endereco;

import java.time.LocalDate;


public class Pessoa {
	private int matricula;
	private String nome;
	private String dataNascimento;
	//Utilizando composição
	private Endereco endereco;
	private Telefone telsContato;

	public void cadastrar (String nome, String dataNascimento, Endereco endereco, Telefone telsContato) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telsContato = telsContato;
	}
	
	public int obterIdade() {
		int anoAtual = LocalDate.now().getYear();
        return anoAtual - Integer.parseInt(dataNascimento);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelsContato() {
		return telsContato;
	}

	public void setTelsContato(Telefone telsContato) {
		this.telsContato = telsContato;
	}
	
	
}

