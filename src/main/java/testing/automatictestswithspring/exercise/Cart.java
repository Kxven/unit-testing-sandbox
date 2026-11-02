package testing.automatictestswithspring.exercise;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private final List<String> items = new ArrayList<>();

    public void add(String item) {
        if (item == null || item.isBlank()) {
            throw new IllegalArgumentException("Item inválido");
        }
        items.add(item);
    }

    public void remove(String item) {
        if (!items.contains(item)) {
            throw new IllegalStateException("Item não está no carrinho");
        }
        items.remove(item);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public boolean contains(String item) {
        return items.contains(item);
    }
}