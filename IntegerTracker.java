package com.Week4;

/**
 * This is an implementation of checking whether an element with a given ID(index) is inside a list or not
 * in O(1) time complexity
 */
public class IntegerTracker {

    protected boolean[] tracker;

    public IntegerTracker(int size) {
        if (size <= 0){
            throw new IllegalArgumentException();
        }
        tracker = new boolean[size];
    }

    public void add(int index){
        if (index >= tracker.length || index < 0){
            throw new IndexOutOfBoundsException();
        }
        tracker[index] = true;
    }

    public void remove(int index){

        if (index >= tracker.length || index < 0){
            throw new IndexOutOfBoundsException();
        }

        tracker[index] = false;
    }

    public boolean contains(int index){
        if (index >= tracker.length || index < 0){
            throw new IndexOutOfBoundsException();
        }
        return tracker[index];
    }
}
