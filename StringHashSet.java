package com.Week4;

import java.util.ArrayList;
import java.util.LinkedList;

public class StringHashSet {
    protected LinkedList<String>[] buckets;
    protected double loadFactor;
    protected int numElements;

    public StringHashSet(int size, int loadFactor){
        if (size <= 0 || loadFactor <= 0){
            throw new IllegalArgumentException();
        }
        buckets = new LinkedList[size];
        for (int i=0; i<size; i++){
            buckets[i] = new LinkedList<>();
        }
        this.loadFactor = loadFactor;
        this.numElements = 0;
    }

    public boolean add(String value){
        if (!contains(value)) {
            int index = hashCode(value) % buckets.length;
            LinkedList<String> bucket = buckets[index];
            bucket.add(value);
            numElements++;
            double averageLoad = numElements / (double) buckets.length;
            if (averageLoad >= loadFactor) {
                resize();
            }
            return true;
        }
        return false;
    }

    public boolean contains(String value){
        int index = hashCode(value) % buckets.length;
        LinkedList<String> bucket = buckets[index];
        return bucket.contains(value);
    }

    private int hashCode(String value){
        return value.length();
    }

    private void resize(){
        int newSize = buckets.length*2;
        LinkedList<String>[] newBuckets = new LinkedList[newSize];
        for (int i=0; i<newSize; i++){
            newBuckets[i] = new LinkedList<>();
        }
        for (int i=0; i< buckets.length; i++){
            LinkedList<String> oldBucket = buckets[i];
            if (!oldBucket.isEmpty()){
                for (String value : oldBucket){
                    int index = hashCode(value) % newSize;
                    newBuckets[index].add(value);
                }
            }
        }
        buckets = newBuckets;
    }

}
