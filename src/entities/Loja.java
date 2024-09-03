package entities;
/*
 * Vai gerenciar o catalogo, clientes e historico de vendas
 * Metodos: cadastrarCliente(), adicionarProduto(), realizarVendas(),
 * calcularTotalVenda(), historicoVendas()
 */

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> produtos;
    private List<Cliente> clientes;
    private List<Venda> historicoVendas;

    public Loja() {
        this.produtos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.historicoVendas = new ArrayList<>();
    }

    public Loja(List<Produto> produtos, List<Cliente> clientes, List<Venda> vendas) {
        this.produtos = produtos;
        this.clientes = clientes;
        this.historicoVendas = vendas;
    }

    public void cadastrarCliente(Cliente cliente) {
        if (buscaCliente(cliente.getNome()) == null) {
            clientes.add(cliente);
            System.out.println("O cliente " + cliente.getNome() + " foi cadastrado!");
        } else {
            System.out.println("Cliente ja cadastrado!");
        }

    }

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("O produto " + produto.getNome() + " foi cadastrado!");
    }

    public void realizarVendas(Cliente cliente, Produto produto, int quantidade) {
        if (!clientes.contains(cliente)) {
            System.out.println("Cliente nao cadastrado!");
            return;
        }

        if (!produtos.contains(produto)) {
            System.out.println("Produto nao cadastrado!");
            return;
        }

        if (!produto.removerEstoque(quantidade)) {
            System.out.println("Quantidade insuficiente em estoque!");
            return;
        } else {
            Venda venda = new Venda(cliente);
            venda.adicionarProduto(produto, quantidade);
            historicoVendas.add(venda);
        }
    }

    public Cliente buscaCliente(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome))
                return cliente;
        }
        return null;
    }

    public Produto buscaProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }
        return null;
    }

    public void listaProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public void listaClientesCadastrados() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void listarHistoricoVendas() {
        for (Venda venda : historicoVendas) {
            System.out.println(venda);
        }
    }
    // listar historico de vendas

}
