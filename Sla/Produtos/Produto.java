package Sla.Produtos;

import javax.swing.JOptionPane;

public class Produto {
    private String codigo_produto;
    private String nome_produto;
    private Familia familia = new Familia();
    private Categoria categoria = new Categoria();

    public void cadastrarProduto() {
        this.codigo_produto = JOptionPane.showInputDialog("Digite o CÓDIGO da Produto:");
        this.nome_produto = JOptionPane.showInputDialog("Digite o NOME da Produto:");
        familia.cadastrarFamilia();
        categoria.cadastrarCategoria();
    }

    public void exibirProduto() {
        JOptionPane.showMessageDialog(null, "Código Produto: " + this.codigo_produto
        + "\nNome Produto: " + this.nome_produto);
        familia.exibirFamilia();
        categoria.exibirCategoria();
    }

}
