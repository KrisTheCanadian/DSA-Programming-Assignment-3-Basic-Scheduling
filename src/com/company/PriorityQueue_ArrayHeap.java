package com.company;

public class PriorityQueue_ArrayHeap<T> extends MinHeap<T> {

    public PriorityQueue_ArrayHeap(int maxsize, T element) {
        super(maxsize, element);
    }

    public void insert(T element, int priority){
        super.insert(element, priority);

    }
}
