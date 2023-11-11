package dev.marcos.veiga.appMain;

//Importando tudo do pacote pessoas
import dev.marcos.veiga.endereco.Endereco;
import br.dev.kenoby.pessoas.*;
import dev.marcos.veiga.pessoas.Cliente;
import dev.marcos.veiga.profissao.Profissao;
import dev.marcos.veiga.telefone.Telefone;

import java.util.Scanner;

//Onde será chamada a aplicação
public class AppMain {
    public static void main(String[] args) {
        //Instanciando os objetos
        Cliente objetoCliente = new Cliente();
        Endereco objetoEndereco = new Endereco();
        Profissao objetoProfissao = new Profissao();
        Telefone objetoTelfone = new Telefone();

        objetoCliente.cadastrar("Carlos Jr", "16/02/1995");
        objetoEndereco.cadastrarEndereco("Rua das puras", "250", "580000", "Joao pessoa", "PB", "BR");
        objetoProfissao.cadastrarProfissao("Analista de TI");
        objetoTelfone.cadastrarTelefone("55", "83", "999999999", "celular");

    }
}
