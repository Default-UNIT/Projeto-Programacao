package Sla.Funcionarios;

import javax.swing.JOptionPane;

import Sla.Pessoa;

public class Gerente extends Pessoa {
    private String cargo;

    public void cadastrarGerente() {
        super.cadastrarFuncionario();
        this.cargo = "Gerente";
    }

    public void exibirGerente() {
        super.exibirFuncionarios();
        JOptionPane.showMessageDialog(null, "Cargo: " + this.cargo);
    }

}
