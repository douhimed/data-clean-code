package org.sqli.datacleancode.cleanCode;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 *
 * Eliminate the obsolete references
 *
 */

// Con you spot the issue
class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }
    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }
    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        return elements[--size];
    }

    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    public Object getByIndex (int index) {
        return elements[index];
    }

    public int getSize() {
        return size;
    }
}

public class Exp03 {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("size : " + stack.getSize());
    }

}
