package com.Week2;


import java.util.LinkedList;

/**
 * This is a demonstration of a Stack data structure
 */
public class MyStack <E> {
    private LinkedList<E> myLinkedList = new LinkedList<E>();

    public void push(E item){
        myLinkedList.addFirst(item);
    }

    public E pop(){
        if (myLinkedList.isEmpty()){
            return null;
        }
        return myLinkedList.removeFirst();
    }

}
