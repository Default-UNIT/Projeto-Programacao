package Sla.Funcionarios;

import javax.swing.JOptionPane;

import Sla.Pessoa;

public class Atendente extends Pessoa {
    private String cargo;

    public void cadastrarAtendente() {
        super.cadastrarFuncionario();
        this.cargo = "Atendente";
    }

    public void exibirAtendente() {
        super.exibirFuncionarios();
        JOptionPane.showMessageDialog(null, "Cargo: " + this.cargo);
    }

}
