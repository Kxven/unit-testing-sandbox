package testing.automatictestswithspring.exercise;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private final List<String> itens = new ArrayList<>();

    public void adicionar(String item) {
        if (item == null || item.isBlank()) {
            throw new IllegalArgumentException("Item inválido");
        }
        itens.add(item);
    }

    public void remover(String item) {
        if (!itens.contains(item)) {
            throw new IllegalStateException("Item não está no carrinho");
        }
        itens.remove(item);
    }

    public boolean estaVazio() {
        return itens.isEmpty();
    }

    public boolean contem(String item) {
        return itens.contains(item);
    }
}
//Carrinho novo está vazio (assertTrue)
//Depois de adicionar "Livro", o carrinho não está vazio (assertFalse)
//Depois de adicionar "Livro", contem("Livro") é verdadeiro (assertTrue)
//contem("Caneta") em um carrinho sem caneta é falso (assertFalse)
//Adicionar null lança IllegalArgumentException (assertThrows)
//Adicionar " " (só espaços) lança IllegalArgumentException (assertThrows)
//Remover um item que não está no carrinho lança IllegalStateException (assertThrows)
//Adicionar e depois remover "Livro" deixa o carrinho vazio (assertTrue)