package org.sqli.datacleancode.cleanCode;

import java.util.*;

/**
 *
 *   Use enums instead of int constants (string...)
 *
 */

class ItemType {

    public static final String TYPE_SCIENCE_BOOK = "SCIENCE";
    public static final String TYPE_ADVENTURE_BOOK = "ADVENTURE";

    public static final String TYPE_SCIENCE_MOVIE = "SC";
    public static final String TYPE_ADVENTURE = "AD";

    private ItemType() {
    }
}

enum BookType {
    SCIENCE, ADVENTURE;
}

enum MovieType {
    SC, AD;
}

public class Exp11 {
    public static void main(String[] args) {

    }
}