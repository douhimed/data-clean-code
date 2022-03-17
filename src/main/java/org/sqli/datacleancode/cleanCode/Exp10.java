package org.sqli.datacleancode.cleanCode;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * Favor static member classes over nonstatic
 *
 * Inner classes (non static member class, local class, anonymous class) require a hidden reference of the global class
 *
 */
class Global {
    public class Inner {
        public void print() {
            System.out.println("inner");
        }
    }

    public static class StaticInner {
        public void print() {
            System.out.println("static inner");
        }
    }

    public Inner getInnerInstance() {
        return new Inner();
    }

    public static StaticInner getStaticInnerClass() {
        return new StaticInner();
    }

}

public class Exp10 {

    public static void main(String[] args) {
        new Global().getInnerInstance().print();
        new Global().new Inner().print();

        new Global.StaticInner().print();
        Global.getStaticInnerClass().print();
    }
}
