package com.Week5;

/**
 * This class demonstrates the functionality of a binary search tree.
 * @param <E> extends from Comparable so that it can be compared.
 */
public class BinarySearchTree<E extends Comparable> extends BinaryTree<E>{

    public boolean contains(E target){
        return search(root, target);
    }

    public boolean add(E value){
        return add(root, value);
    }

    public void printSorted(){
        traverse(root);
    }

    private boolean search(Node<E> n, E target){
        if (n == null) return false;
        if (target.compareTo(n.value) == 0){
            return true;
        }else if (target.compareTo(n.value) > 0){
            return search(n.rightChild, target);
        }else{
            return search(n.leftChild, target);
        }
    }

    private boolean add(Node<E> n, E value){
        if (n == null){
            n = new Node<E>(value);
            return true;
        }
        if (value.compareTo(n.value) == 0){
            return false;
        }else if (value.compareTo(n.value) > 0){
            return add(n.rightChild, value);
        }else{
            return add(n.leftChild, value);
        }
    }

    private void traverse(Node<E> n){
        if (n == null) return;
        traverse(n.leftChild);
        System.out.println(n.value);
        traverse(n.rightChild);
    }
}
