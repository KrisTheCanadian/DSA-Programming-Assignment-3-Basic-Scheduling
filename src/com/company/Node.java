package com.company;

public class Node<T> {
    int priority;
    T element;

    public Node(T element, int priority){
        this.priority = priority;
        this.element = element;
    }
}
