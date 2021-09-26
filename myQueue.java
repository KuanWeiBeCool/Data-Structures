package com.Week2;

import java.util.LinkedList;

/**
 * This is a demonstration of a Queue data structure
 */
public class myQueue<E> {
    private LinkedList<E> list = new LinkedList<E>();

    public void add(E item){
        list.addLast(item);
    }

    public E remove(){
        if (list.isEmpty()){
            return null;
        }
        return list.removeFirst();
    }

}
