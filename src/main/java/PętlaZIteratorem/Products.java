package PętlaZIteratorem;

import java.util.ArrayList;
import java.util.Iterator;

public class Products extends Product {
    public Products(String name) {
        super(name);
    }

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            products.add(new Product("Product#" + i));
        }
        Iterator<Product>iterator= products.iterator();
        while (iterator.hasNext()){
            Product product = iterator.next();
            System.out.println(product);
        }
    }
}
