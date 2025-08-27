package br.com.fiap.exemplo.model;

public class Bebida extends Produto {
    private int tamanho;

    public Bebida() {
        super();
    }

    public Bebida(String nome, String ingredientes, Double preco, int tamanho) {
        super(nome, ingredientes, preco);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String getResumo() {
        return "Nome: " + this.getNome() +
                " | Ingredientes: " + this.getIngredientes() +
                " | Preço: R$ " + this.getPreco() +
                " | Quantidade: " + this.getTamanho() + "ml";
    }
}
