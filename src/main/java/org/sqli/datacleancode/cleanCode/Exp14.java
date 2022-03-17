package org.sqli.datacleancode.cleanCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * Prefer lists to arrays
 *
 */
public class Exp14 {

    private static void process(Item[] items) {
        items[0] = new ItemB();
    }

    private static void process(List<Item> items) {
        items.add(new ItemB());
    }

    public static void main(String[] args) {
        // process(new ArrayList<ItemA>());
        // process(new ItemA[1]);
    }
}

class Item {

}

class ItemA extends Item {
    public void print() {
        System.out.println("itemA");
    }
}

class ItemB extends Item {

}
