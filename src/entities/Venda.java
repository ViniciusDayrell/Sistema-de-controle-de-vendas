package entities;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private List<Produto> produtos;
    private List<Integer> quantidades;
    private Cliente cliente;
    private double valorTotalVenda;

    public Venda(Cliente cliente) {
        this.produtos = new ArrayList<>();
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public double getValorTotalVenda() {
        return valorTotalVenda;
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        produtos.add(produto);
        quantidades.add(quantidade);
        valorTotalVenda += produto.getPreco() * quantidade;
    }

    @Override
    public String toString() {
        return "Venda =  Produtos: " + produtos + ", quantidades:" + quantidades + ", Cliente=" + cliente
                + ", Valor Total: " + valorTotalVenda;
    }

}
