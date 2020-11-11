package com.company;

public class MinHeap<T> {

    private static final int FRONT = 1;

    private Object[] Heap;
    private int size = 0;
    private int maxsize = -1;

    public MinHeap(int maxsize, T element){
        this.maxsize = maxsize;
        this.size = 1;
        Heap = new Object[this.maxsize + 1];
        Heap[0] = null;
        Heap[1] = new Node<T>(element, 1);
    }

    private boolean isLeaf(int pos){
        return pos >= (size / 2);
    }

    private void swap(int firstPosition, int secondPosititon){
        Object temp;
        temp = Heap[firstPosition];
        Heap[firstPosition] = Heap[secondPosititon];
        Heap[secondPosititon] = temp;
    }

    private int parent(int pos){
        return pos / 2;
    }

    private int leftChild(int pos){
        return (2 * pos);
    }

    private int rightChild(int pos){
        return (2 * pos) + 1;
    }

    private void minHeapify(int position){
        if (!isLeaf(position)) {
            Node<T> pos = (Node<T>)Heap[position];
            Node<T> left = (Node<T>)Heap[position];
            Node<T> right = (Node<T>)Heap[position];

            if (pos.priority > left.priority
                    || pos.priority > right.priority) {

                if (pos.priority < right.priority) {
                    swap(position, leftChild(position));
                    minHeapify(leftChild(position));
                }
                else {
                    swap(position, rightChild(position));
                    minHeapify(rightChild(position));
                }
            }
        }
    }

    public void insert(T element, int priority) {
        if (size >= maxsize) {
            return;
        }

        Heap[++size] = new Node<T>(element, priority);
        int current = size;

        Node<T> currentNode = (Node<T>) Heap[current];
        Node<T> parentNode = (Node<T>) Heap[parent(current)];

        while (currentNode.priority < parentNode.priority) {
            swap(current, parent(current));
            current = parent(current);
            currentNode = (Node<T>) Heap[current];
            parentNode = (Node<T>) Heap[parent(current)];
        }
    }

    public Node<T> remove()
    {
        Node<T> popped = (Node<T>)Heap[FRONT];
        Heap[FRONT] = Heap[size--];
        minHeapify(FRONT);
        return popped;
    }

    public void minHeap()
    {
        for (int pos = (size / 2); pos >= 1; pos--) {
            minHeapify(pos);
        }
    }
}
