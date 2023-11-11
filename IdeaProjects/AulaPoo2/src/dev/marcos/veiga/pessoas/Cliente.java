package dev.marcos.veiga.pessoas;

import dev.marcos.veiga.telefone.Telefone;
import dev.marcos.veiga.endereco.Endereco;
import dev.marcos.veiga.profissao.Profissao;

public class Cliente extends Pessoa {
	private String codigo;
	private Profissao profissao;

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Profissao getProfissao() {
		return profissao;
	}
	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}
	
	public void cadastrar(String codigo, Profissao profissao, String nome, String dataNascimento, Endereco endereco, Telefone telsContato) {
		this.codigo = codigo;
		setNome(nome);
		setDataNascimento(dataNascimento);
		setEndereco(endereco);
		setTelsContato(telsContato);
		setProfissao(profissao);
	}
}
