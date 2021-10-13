package com.Week7;

public class MaxIntHeap {

    protected int[] values;
    protected int size = 0; // number of elements current in the head

    public MaxIntHeap(int maxHeight){
        values = new int[(int) Math.pow(2, maxHeight)-1]; //Math.pow() returns a double
    }

    public int max(){
        return values[0];
    }

    public void add(int value){
        if (size == values.length){
            increaseCapacity();
        }

        values[size] = value;

        int currIndex = size;
        int parentIndex = (size-1)/2;
        while(parentIndex > 0){
            if (values[currIndex] > values[parentIndex]){
                // Swap parent and current
                int temp = values[currIndex];
                values[currIndex] = values[parentIndex];
                values[parentIndex] = temp;

                // Keep bubble up
                currIndex = parentIndex;
                parentIndex = (currIndex-1)/2;
            }else{
                break;
            }
        }
        size++;
    }

    public int removeMax(){
        if (size == 0){
            return 0;
        }
        int max = values[0];
        values[0] = values[size--];

        int currIndex = 0;
        int leftChildIndex = 1;
        int rightChildIndex = 2;
        int greaterChildIndex = 0;
        while (leftChildIndex < size || rightChildIndex < size){
            if (leftChildIndex < size && values[leftChildIndex] < values[rightChildIndex]){
                greaterChildIndex = leftChildIndex;
            }else if (rightChildIndex < size){
                greaterChildIndex = rightChildIndex;
            }else{
                break;
            }
            if (values[currIndex] < values[greaterChildIndex]){
                // Swap parent and current
                int temp = values[currIndex];
                values[currIndex] = values[greaterChildIndex];
                values[greaterChildIndex] = temp;

                // Keep bubble down
                currIndex = greaterChildIndex;
                leftChildIndex = (currIndex * 2) + 1;
                rightChildIndex = (currIndex * 2) + 2;
            }else{
                break;
            }
        }
        return max;
    }

    private void increaseCapacity(){
        int[] newArray = new int[size * 2];
        System.arraycopy(values, 0, newArray, 0, size);
        values = newArray;
    }


}
