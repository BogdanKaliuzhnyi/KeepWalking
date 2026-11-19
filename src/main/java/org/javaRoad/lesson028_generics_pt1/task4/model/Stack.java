package org.javaRoad.lesson028_generics_pt1.task4.model;


import org.javaRoad.lesson028_generics_pt1.task4.exception.EmptyNodeException;
import org.javaRoad.lesson028_generics_pt1.task4.exception.FindingNodeException;

import java.util.Objects;

public class Stack<T> {
    private Node top;
    private int size;

    public void add(T value) {
        if (value == null) {
            throw new EmptyNodeException();
        }
        top = new Node(value, top);
        size++;
    }

    public void delete() {
        if (top == null) {
            throw new EmptyNodeException();
        }
        top = top.next;
        size--;
    }

    public int getSize() {
        return size;
    }

    public boolean hasValue(T value) {
        Node node = top;
        while (node != null) {
            if (Objects.equals(value, node.value)) {
                return true;
            }
            node = node.next;
        }
        throw new FindingNodeException(Objects.isNull(value) ? null : value.toString());
    }

    public String toStringAsArray() {
        Node node = top;
        StringBuilder result = new StringBuilder("[");
        while (node != null) {
            result.append(node.value.toString());
            if (node.next != null) {
                result.append(", ");
            }
            node = node.next;
        }
        return result.append("]").toString();
    }

    private class Node {
        private final T value;
        private final Node next;

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
