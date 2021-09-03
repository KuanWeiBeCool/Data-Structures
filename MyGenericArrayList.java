package com.Week1;

/**
 * A generic ArrayList that takes a Type of the element <E>
 * @author kuanw
 *
 * @param <E> the type of the element
 */
public class MyGenericArrayList<E> {
	protected int size = 0;
	protected Object[] data;
	
	public MyGenericArrayList(int capacity) {
		data = new Object[capacity];
	}
	
	/**
	 * If no capacity entered, by default create an array with length 1.
	 */
	public MyGenericArrayList() {
		data = new Object[1];
	}
	/**
	 * Add a String to the ArrayList. If the array is full, double the capacity
	 * to fit in the value.
	 * @param value
	 */
	public void add(E value) {
		if (size == data.length) {
			increaseCapacity();
		}
		// First use the size, then increment the size.
		data[size++] = value;
	}
	
	/**
	 * Add a String to the ArrayList at a given index.
	 * @param index
	 * @param value
	 */
	public void add(int index, E value){
		
		// Throw an exception if the index is out of bound
		// i.e. either it's smaller than 0 or it's larger than the index of the 
		// last element
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		
		if (size == data.length) {
			increaseCapacity();
		}
		
		System.arraycopy(data, index, data, index+1, size-index);
		data[index] = value;
		size++;
	}
	
	public E get(int index) {
		// Throw an exception if the index is out of bound
		// i.e. either it's smaller than 0 or it's larger than the index of the 
		// last element
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		
		return (E) data[index];
	}
	
	/**
	 * Helper method to double the capacity of the array.
	 */
	private void increaseCapacity() {
		int capacity = data.length;
		Object[] newData = new Object[capacity*2];
		System.arraycopy(data, 0, newData, 0, capacity);
		data = newData;
	}
}
