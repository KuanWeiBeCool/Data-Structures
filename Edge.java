package com.Week8;

public class Edge<E> {

    private E source;
    private E destination;
    private int weight;

    public Edge (E source, E destination, int weight){
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public E getSource() {
        return source;
    }

    public E getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }

    public boolean equals(Edge<E> other){
        return source.equals(other.source) && destination.equals(other.destination);
    }
}
