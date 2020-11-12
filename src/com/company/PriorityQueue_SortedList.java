package com.company;

public class PriorityQueue_SortedList<T> implements IPriorityQueue<T> {

    private Object[] array;
    private int size;

    public PriorityQueue_SortedList(int size, T element){
        array = new Object[size];
        array[0] = new Node<T>(element, 1);
    }

    public boolean updatePriority(T element, int priority){
        Node<T> CurrentNode;
        for(int i = 0; i < array.length; i++){
            if(array[i] != null){
                CurrentNode = (Node<T>) array[i];
                if(CurrentNode.element == element){
                    ((Node<T>) array[i]).priority = priority;
                    return true;
                }
            }
        }
        return false;
    }



    public void insert(T element, int priority){
        if(array.length <= size){
            growSize();
        }
        Node<T> newNode = new Node<>(element, priority);
        Node<T> currentNode;
        for(int i = 0; i < array.length; i++){

            currentNode = (Node<T>) array[i];

            if(array[i] != null){
                if(currentNode.priority > priority){
                    for(int j = array.length -2 ; j > i - 1; j--){
                        currentNode = (Node<T>) array[j];
                        if(currentNode != null ){
                            array[j+1] = currentNode;
                        }
                    }
                    array[i] = newNode;
                    size++;
                    return;
                }

            }
            else if(currentNode == null){
                array[i] = newNode;
                size++;
                return;
            }
        }
    }

    public T remove(){
        Node<T> popedElement = (Node<T>)array[0];
        for(int i = 0; i < array.length - 1; i++ ){
            array[i] = array[i + 1];
        }
        size--;
        return popedElement.element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T removeLast() {
        Node<T> popped = (Node<T>) array[size];
        array[size] = null;
        return popped.element;
    }

    public void growSize(){
        int oldmaxsize = size;
        size *= 2;
        Object[] newArray = new Object[size];

        for(int i= 0; i < oldmaxsize; i++){
            newArray[i] = array[i];
        }

        array = newArray;
    }


}
