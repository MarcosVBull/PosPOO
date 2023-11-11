package dev.marcos.veiga.profissao;

public class Profissao {
    private String nomeProfissao;

    public void cadastrarProfissao(String nomeProfissao){
        this.nomeProfissao = nomeProfissao;
    }

    public String getNomeProfissao() {
        return nomeProfissao;
    }

    public void setNomeProfissao(String nomeProfissao) {
        this.nomeProfissao = nomeProfissao;
    }
}
