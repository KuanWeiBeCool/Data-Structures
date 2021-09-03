package com.Week2;

/**
 * This is a demonstration of LinkedList
 */
public class MyLinkedList <E> {

    class Node{
        E value;
        Node next = null;
        Node(E value){
            this.value = value;
        }
    }
    // At first, no node is present
    protected Node head = null;
    protected Node tail = null;

    private void addFirst(E value){
        Node newNode = new Node(value);
        // Since we add the new node before the previous head, the new note should point to the previous head.
        newNode.next = head;
        // Now, head should become the new node.
        head = newNode;
        // If we didn't have any node before, the new node is both the tail and the head
        if (tail==null){
            tail = newNode;
        }
    }

    private void addLast(E value){
        Node newNode = new Node(value);
        // If the list was empty, tail is null and doesn't have a .next field
        if (head == null) {
            head = newNode;
        }else{
            // newNode becomes the new tail. Thus, the previous tail should point to the new node
            tail.next = newNode;
        }
        // make the new node the new tail
        tail = newNode;
    }

    public void add(int index, E value){
        if (index < 0) throw new IndexOutOfBoundsException();
        if (index == 0) addFirst(value);
        else{
            Node newNode = new Node(value);
            Node current = head;
            // Note we use index-1 because each time we call current.next. When i == index-1,
            for (int i = 0; i < index-1; i++){
                if (current.next == null) throw new IndexOutOfBoundsException();
                current = current.next;
            }
            if (current.next == null) tail = newNode;
            // First, point the new node to what the current note is pointing to
            newNode.next = current.next;
            // Then, point the current node to the new node. Now, the new node is between the current node
            // and the node which the current node used to point to
            current.next = newNode;
        }

    }

    public void removeFirst(){
        // We simply assign head to be the next element
        if (head != null) {
            head = head.next;
        }
        // If there is no element for head, that means we removed all elements
        // set tail also be null
        if (head == null){
            tail = null;
        }
    }

    public void removeLast(){
        // If head is null, that means we don't have anything.
        if (head == null){
            return;
        }
        // If head is the same as tail, that means we only have one element in the list
        // to remove it, we simply assign both head and tail to be null
        if (head == tail){
            head = null;
            tail = null;
        }
        Node current = head;
        while (current.next != tail){
            current = current.next;
        }
        tail = current;
        current.next = null;
    }

    public void remove(int index){
        if (index < 0) throw new IndexOutOfBoundsException();
        if (index == 0) removeFirst();
        else{
            Node current = head;
            for (int i=0; i < index - 1; i++){
                if (current.next == null) throw new IndexOutOfBoundsException();
                current = current.next;
            }
            if (current.next == tail) removeLast();
            else{
                current.next = current.next.next;
            }
        }
    }

    public boolean contains(E value){
        Node current = head;
        while (current != null){
            if (current.equals(value)) return true;
            current = current.next;
        }
        return false;
    }

    public E get(int index){
        Node current = head;
        if (index < 0) throw new IndexOutOfBoundsException();
        else{
            for (int i=0; i < index; i++) {
                if (current == null) throw new IndexOutOfBoundsException();
                current = current.next;
            }
        }
        return current.value;
    }
}
