package com.Week5;

/**
 * This class demonstrates the functionality of a binary tree
 * @param <E>
 */
public class BinaryTree<E> {

    class Node<E> {
        E value;
        Node<E> leftChild = null;
        Node<E> rightChild = null;
        Node (E value){
            this.value = value;
        }
    }
    // Note that we need to initialize a root, as every tree has to have a root.
    protected Node<E> root = null;


}
