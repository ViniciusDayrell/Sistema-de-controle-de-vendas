package entities;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private List<Produto> produtos;
    private Cliente cliente;
    private int quantidade;

    public Venda() {
        this.produtos = new ArrayList<>();
    }

    public Venda(Cliente cliente, int quantidade) {
        this.cliente = cliente;
        this.quantidade = quantidade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public int getQuantidade() {
        return quantidade;
    }

}
