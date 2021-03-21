package model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Produto {
    private String codProduto;
    private String nomeProduto;
    private String catProduto;
    private String fmlProduto;

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getCatProduto() {
        return catProduto;
    }

    public void setCatProduto(String catProduto) {
        this.catProduto = catProduto;
    }

    public String getFmlProduto() {
        return fmlProduto;
    }

    public void setFmlProduto(String fmlProduto) {
        this.fmlProduto = fmlProduto;
    }
    
    public void registrarProduto() {
        try {
            FileWriter escreverArq = new FileWriter("./produto.txt", true);
            PrintWriter pr = new PrintWriter(escreverArq);

            pr.println("Código: " + this.codProduto + ";Nome: " + this.nomeProduto
            + ";Categoria: " + this.catProduto + ";Família: " + this.fmlProduto);

            pr.flush();
            escreverArq.close();

        } catch(IOException e) {
            System.out.println("Erro ao cadastrar usuário!");
        }
    }
}
