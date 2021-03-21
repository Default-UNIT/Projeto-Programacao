package model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Funcionario {
    private String codFuncionario;
    private String nomeFuncionario;
    private String cpfFuncionario;
    private String opcFuncionario;

    public String getOpcFuncionario() {
        return opcFuncionario;
    }

    public void setOpcFuncionario(String opcFuncionario) {
        this.opcFuncionario = opcFuncionario;
    }

    public String getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(String codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }
    
    public void registrarFuncionario() {
        try {
            FileWriter escreverArq = new FileWriter("./funcionario.txt", true);
            PrintWriter pr = new PrintWriter(escreverArq);

            pr.println("Cargo: " + this.opcFuncionario + ";Código: " + this.codFuncionario
            + ";Nome: " + this.nomeFuncionario + ";Cpf: " + this.cpfFuncionario);

            pr.flush();
            escreverArq.close();

        } catch(IOException e) {
            System.out.println("Erro ao cadastrar usuário!");
        }
    }
    
}
