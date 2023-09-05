package tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 */
public class ShoppingCart { //presenta el carrito de compras y sus opciones
    private final List<Product> items = Collections.unmodifiableList(new ArrayList<>());
    private Product Product;

    private List<Product> getItems() {
        return items;
    }
    private double calculateTotalPrice(){
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

    private static class Product {
        public double getPrice() {
            final int i = 0;
            final int i1;
            i1 = i;
            return i1;
        }
    }
}
