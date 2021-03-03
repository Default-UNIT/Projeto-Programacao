package Sla.Funcionarios;

import javax.swing.JOptionPane;

import Sla.Pessoa;

public class Vendedor extends Pessoa {
    private String cargo;

    public void cadastrarVendedor() {
        super.cadastrarFuncionario();
        this.cargo = "Vendedor";
    }

    public void exibirVendedor() {
        super.exibirFuncionarios();
        JOptionPane.showMessageDialog(null, "Cargo: " + this.cargo);
    }
}
