package dev.marcos.veiga.telefone;

public class Telefone {
    private String codigoPais;
    private String ddd;
    private String numero;
    private String tipo;

    public void cadastrarTelefone(String codigoPais, String ddd, String numero, String tipo){
        this.codigoPais = codigoPais;
        this.ddd = ddd;
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
