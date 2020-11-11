package com.company;

public class Main {

    public static void main(String[] args) {

        PriorityQueue_ArrayHeap<Integer> priorityQueue = new PriorityQueue_ArrayHeap<>(40, 1);
        priorityQueue.insert(5, 3);
        priorityQueue.insert(6, 1);
        priorityQueue.insert(6, 1);
        priorityQueue.insert(4, 1);
        priorityQueue.insert(3, 10);
        priorityQueue.insert(3, 15);
    }
}
