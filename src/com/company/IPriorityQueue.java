package com.company;

public interface IPriorityQueue<T> {
    void insert(T element, int priority);
    T remove();
    int size();
    T removeLast();
}
