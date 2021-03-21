package model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void registrarCliente() {
        try {
            FileWriter escreverArq = new FileWriter("./cliente.txt", true);
            PrintWriter pr = new PrintWriter(escreverArq);
            
            pr.println("Telefone: " + this.telefone + ";Nome: " + this.nome + ";Cpf: " + this.cpf + "\n");
            
            pr.flush();
            escreverArq.close();
            
        } catch(IOException e) {
            System.out.println("Erro ao cadastrar usuário!");
        }
    }

}
