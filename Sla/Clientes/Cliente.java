package Sla.Clientes;

import javax.swing.JOptionPane;

import Sla.Pessoa;

public class Cliente extends Pessoa {
    private String telefone;
    private String endereco;

    public void cadastrarCliente() {
        super.cadastrarClientes();
        this.telefone = JOptionPane.showInputDialog("Digite o TELEFONE do Cliente:");
        this.endereco = JOptionPane.showInputDialog("Digite o ENDEREÇO do Cliente:");
    }

    public void exibirCliente() {
        super.exibirClientes();
        JOptionPane.showMessageDialog(null, "Telefone: " + this.telefone
        + "\nEndereço: " + this.endereco);
    }
}
