package org.sqli.datacleancode.cleanCode;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * Always override hashCode when override equals
 *
 */
public class Exp05 {

    public static void main(String[] args) {

        Set<Product> products = new HashSet<>();
        products.add(new Product(1, "product1"));
        products.add(new Product(1, "product1"));
        System.out.println(products);

    }

}
