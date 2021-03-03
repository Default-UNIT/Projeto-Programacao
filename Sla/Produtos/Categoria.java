package Sla.Produtos;

import javax.swing.JOptionPane;

public class Categoria {
    private String nome_categoria;
    private String tipo_categoria;
    private String descricao_categoria;

    public void cadastrarCategoria() {
        this.nome_categoria = JOptionPane.showInputDialog("Digite o NOME da Categoria:");
        this.tipo_categoria = JOptionPane.showInputDialog("Digite o TIPO da Categoria:");
        this.descricao_categoria = JOptionPane.showInputDialog("Digite o Descrição da Categoria:");
    }

    public void exibirCategoria() {
        JOptionPane.showMessageDialog(null, "Nome Categoria: " + this.nome_categoria
        + "\nTipo Categoria: " + this.tipo_categoria
        + "\nDescrição Categoria: " + this.descricao_categoria);
    }
}
