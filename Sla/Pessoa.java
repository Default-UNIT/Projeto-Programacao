package Sla;

import javax.swing.JOptionPane;

public class Pessoa {
    private String nome;
    private String cpf;
    private Double salario;

    //Cadastrar Clientes
    public void cadastrarClientes() {
        this.nome = JOptionPane.showInputDialog("Digite o NOME do Cliente:");
        this.cpf = JOptionPane.showInputDialog("Digite o CPF do Cliente:");
    }

    //Cadastrar Funcionario
    public void cadastrarFuncionario() {
        this.nome = JOptionPane.showInputDialog("Digite o NOME do Funcionário:");
        this.cpf = JOptionPane.showInputDialog("Digite o CPF do Funcionário:");
        this.salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o SALÁRIO do Funcionário:"));
	}

    //Exibir (MUDANÇAS NO FUTURO)
    public void exibirClientes() {
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome
        + "\nCpf: " + this.cpf);
    }

    public void exibirFuncionarios() {
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome
        + "\nCpf: " + this.cpf
        + "\nSalário: " + this.salario);
    }

}
