package entities;

public class Cliente {
    private String nome;
    private int id;

    public Cliente(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cliente: id = " + id + "Nome = " + nome;
    }

}
