package Sla.Produtos;

import javax.swing.JOptionPane;

public class Familia {
    private String nome_familia;
    private String tipo_familia;

    public void cadastrarFamilia() {
        this.nome_familia = JOptionPane.showInputDialog("Digite o NOME da Familia:");
        this.tipo_familia = JOptionPane.showInputDialog("Digite o TIPO da Familia:");
    }

    public void exibirFamilia() {
        JOptionPane.showMessageDialog(null, "Nome Família: " + this.nome_familia
        + "\nTipo Família: " + this.tipo_familia);
    }
}
