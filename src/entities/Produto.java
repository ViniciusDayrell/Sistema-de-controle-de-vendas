package entities;

public class Produto {
    private String nome;
    private double preco;
    private int codigo;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int codigo, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEstoque += quantidade;
        }
    }

    public boolean removerEstoque(int quantidade) {
        if (quantidade > 0 && this.quantidadeEstoque >= quantidade) {
            this.quantidadeEstoque -= quantidade;
            return true;
        }
        return false;

    }

}
