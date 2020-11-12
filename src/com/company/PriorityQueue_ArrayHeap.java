package com.company;

public class PriorityQueue_ArrayHeap<T> extends MinHeap<T> implements IPriorityQueue<T> {

    public PriorityQueue_ArrayHeap(int maxsize, T element) {
        super(maxsize, element);
    }

    public void insert(T element, int priority){
        super.insert(element, priority);

    }

    public T remove(){
        return super.remove();
    }

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public T removeLast() {
        return super.removeLast();
    }
}
