package Sla;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Sla.Funcionarios.Gerente;
import Sla.Clientes.Cliente;
import Sla.Funcionarios.Atendente;
import Sla.Funcionarios.Vendedor;
import Sla.Produtos.Produto;

public class Main {
    public static void main(String[] args) {
        //Listas p/ JOption
        Object[] options = {"Cadastrar", "Exibir"};
        Object[] cadastro = {"Cliente", "Funcionário", "Produto"};
        Object[] cargos = {"Gerente", "Atendente", "Vendedor"};

        //Listas p/ os Objetos
        List<Cliente> lista_cliente = new ArrayList<>();
        List<Gerente> lista_gerente = new ArrayList<>();
        List<Atendente> lista_atendente = new ArrayList<>();
        List<Vendedor> lista_vendedor = new ArrayList<>();
        List<Produto> lista_produto = new ArrayList<>();

        //Variáveis
        int opc, opc_cadastro, opc_exibir, opc_cargos;

        while(true) {
            //Cadastras ou Exibir
            opc = JOptionPane.showOptionDialog(null, "Escolha uma opção abaixo:","Sistema Panelinha", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, options, options[0]);

            switch (opc) {
                //Cadastro (Cliente, Funcionario, Produto)
                case 0:
                    // (Cliente, Funcionario, Produto)
                    opc_cadastro = JOptionPane.showOptionDialog(null, "Escolha uma opção abaixo:","Cadastrar Panelinha", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, cadastro, cadastro[0]);

                    switch (opc_cadastro) {
                        //Cadastrar Cliente 
                        case 0:
                            //Cadastro do Cliente
                            Cliente cliente = new Cliente();
                            cliente.cadastrarCliente();
                            lista_cliente.add(cliente);

                            break;

                        //Cadastrar Funcionario (Gerente, Atendente, Vendedor)
                        case 1:
                            opc_cargos = JOptionPane.showOptionDialog(null, "Escolha uma opção abaixo:","Panelinha Funcionarios", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, cargos, cargos[0]);

                            switch (opc_cargos) {
                                case 0:
                                    //Cadastro do Gerente
                                    Gerente gerente = new Gerente();
                                    gerente.cadastrarGerente();
                                    lista_gerente.add(gerente);

                                    break;
        
                                case 1:
                                    //Cadastro do Atendente
                                    Atendente atendente = new Atendente();
                                    atendente.cadastrarAtendente();
                                    lista_atendente.add(atendente);

                                    break;
                                
                                case 2:
                                    //Cadastro do Vendedor
                                    Vendedor vendedor = new Vendedor();
                                    vendedor.cadastrarVendedor();
                                    lista_vendedor.add(vendedor);

                                    break;
                            
                                default:
                                    break;
                            }   
                            break;

                        //Cadastrar Produto
                        case 2:
                            //Cadastro do Produto (Junto com Categoria e Família)
                            Produto produto = new Produto();
                            produto.cadastrarProduto();
                            lista_produto.add(produto);

                            break;

                        default:
                            break;
                    }
                        break;

                //Exibir (Cliente, Funcionario, Produto)
                case 1:
                    opc_exibir = JOptionPane.showOptionDialog(null, "O que deseja Exibir:","Exibir Panelinha", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, cadastro, cadastro[0]);

                    switch (opc_exibir) {
                        case 0:
                            //Verificar se algum Cliente foi cadastrado
                            if(lista_cliente.size() == 0) {
                                JOptionPane.showMessageDialog(null, "Nenhum Cliente Cadastrado!");
                            } else {
                                for(Cliente cliente : lista_cliente) {
                                    cliente.exibirCliente();
                                }
                            }

                            break;
                        
                        //Exibir Funcionários (Gerente, Atentende, Vendedor)
                        case 1:
                            //Verificar se algum Funcionário foi cadastrado
                            if(lista_gerente.size() == 0 && lista_atendente.size() == 0 && lista_vendedor.size() == 0) {
                                JOptionPane.showMessageDialog(null, "Nenhum Funcionário Cadastrado!");
                            } else {
                                //Exibindo Gerente
                                for(Gerente gerente : lista_gerente) {
                                    gerente.exibirGerente();
                                }

                                //Exibindo Atendente
                                for(Atendente atendente : lista_atendente) {
                                    atendente.exibirAtendente();
                                }

                                //Exibindo Vendedor
                                for(Vendedor vendedor : lista_vendedor) {
                                    vendedor.exibirVendedor();
                                }
                            }

                            break;
                        
                        //Exibir Produtos (Junto com Categoria e Família)
                        case 2:
                            //Verificar se algum Produto foi cadastrado
                            if(lista_produto.size() == 0) {
                                JOptionPane.showMessageDialog(null, "Nenhum Produto Cadastrado!");
                            } else {
                                for(Produto produto : lista_produto) {
                                    produto.exibirProduto();
                                }
                            }

                            break;

                        default:
                            break;
                    }            
            }
        }
    }
}
