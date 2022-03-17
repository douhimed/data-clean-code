package org.sqli.datacleancode.cleanCode;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * Consider implementing Comparable (at least)
 *
 */
public class Exp06 {

    public static void main(String[] args) {

        Set<Product> products = new TreeSet<>();
        products.add(new Product(1, "product1"));
        products.stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new));

    }
}
