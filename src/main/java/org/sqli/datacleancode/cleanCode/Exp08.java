package org.sqli.datacleancode.cleanCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * beware of references escape (Objects and Collections);
 *
 */
class ListProducts {

    private List<String> products;

    {
        products = new ArrayList<>();
        products.add("P1");
        products.add("P2");
    }

    public List<String> getProducts() {
        return products;
    }
}

public class Exp08 {

    public static void main(String[] args) {

        final ListProducts listProducts = new ListProducts();
        final List<String> products = listProducts.getProducts();
        products.clear();
        System.out.println(listProducts.getProducts());

    }
}
