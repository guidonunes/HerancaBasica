package br.com.fiap.exemplo.view;

import br.com.fiap.exemplo.model.Bebida;
import br.com.fiap.exemplo.model.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Bebida bebida = new Bebida("Suco de Laranja", "Água, laranja, açúcar, gelo", 7.85, 500);
        System.out.print("A bebida informada foi " + bebida.getNome());
        System.out.print(", é composta por " + bebida.getIngredientes());
        System.out.print(", custa R$" + bebida.getPreco());
        System.out.print(" e seu tamanho é de " + bebida.getTamanho() + "ml");
    }
}

