package com.Week6;/*
 * I attest that the code in this file is entirely my own except for the starter
 * code provided with the assignment and the following exceptions:
 * <Enter all external resources and collaborations here. Note external code may
 * reduce your score but appropriate citation is required to avoid academic
 * integrity violations. Please see the Course Syllabus as well as the
 * university code of academic integrity:
 *  https://catalog.upenn.edu/pennbook/code-of-academic-integrity/ >
 * Signed,
 * Author: Kuan Wei
 * Penn email: <kuanwei@seas.upenn.edu>
 * Date: 2021-10-06
 */


public class BinarySearchTree<E extends Comparable<E>> {
    class Node {
        E value;
        Node left = null;
        Node right = null;

        Node(E value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "( " + value + " )";
        }
    }

    protected Node root = null;
    protected int size = 0;

    /**
     * Adds value to BST and returns true only if value is non-null and does not
     * already exist in the BST.
     * 
     * @param val Value to be added to BST
     * @return True only if element was added to BST
     */
    public boolean add(E val) {
        if (val == null)
            return false;
        int size = this.size;
        this.root = add(this.root, val);
        return size != this.size;
    }

    /**
     * Adds a value to the tree starting at Node n, returning the node occupying the
     * same position as was given, which may be a new node containing the given
     * value if the given node is null, or it may be an existing node if that node
     * already contains the given value.
     * 
     * @param n   The subtree to which to add the value
     * @param val The value to add
     * @return The updated subtree root (possibly null) after adding the value
     */
    private Node add(Node n, E val) {
        if (n == null) {
            this.size++;
            return new Node(val);
        }

        int cmp = val.compareTo(n.value);
        if (cmp < 0)
            n.left = add(n.left, val);
        else if (cmp > 0)
            n.right = add(n.right, val);
        return n;
    }

    /**
     * Removes value from BST and returns true only if value is non-null and existed
     * in BST.
     * 
     * @param val The value to remove
     * @return True only if the value was removed from the BST
     */
    public boolean remove(E val) {
        if (val == null)
            return false;
        int size = this.size;
        this.root = remove(this.root, val);
        return size != this.size;
    }

    /**
     * Removes a value from the tree starting at Node n, returning the node
     * occupying the same position as was given (which can be null if the given node
     * gets removed).
     * 
     * The below code follows the BST node deletion algorithm described in Data
     * Structures and Algorithms in Java, Section 11.1.2, page 464.
     * 
     * @param n   The subtree from which to remove the value
     * @param val The value to remove
     * @return The updated subtree root (possibly null) after removing the value
     */
    private Node remove(Node n, E val) {
        if (n == null)
            return null;
        int cmp = val.compareTo(n.value);
        if (cmp < 0)
            n.left = remove(n.left, val);
        else if (cmp > 0)
            n.right = remove(n.right, val);
        else if (n.left == null) {
            /*
             * The value of n.right is the correct return value for this method whether it
             * is null or a Node. Thus there is no need for a (n.left == null && n.right ==
             * null) branch.
             */
            this.size--;
            return n.right;
        } else if (n.right == null) {
            this.size--;
            return n.left;
        } else {
            E pred = maxValue(n.left);
            n.value = pred;
            n.left = remove(n.left, pred);
        }

        return n;
    }

    /**
     * Returns the maximum value contained in the subtree rooted at the given Node,
     * or null if the given subtree is empty.
     * 
     * @param n The subtree from which to search for the maximum value
     * @return The value of the node at the rightmost position, which holds the
     *         maximum value of the represented sorted set
     */
    protected E maxValue(Node n) {
        if (n == null)
            return null;
        if (n.right == null)
            return n.value;
        return maxValue(n.right);
    }

    /*
     * ASSIGNMENT METHODS: Implement the methods below.
     */

    /**
     * Given a value that is stored in this BST, this method returns the
     * corresponding Node that holds it, or null if the value is null or does
     * not exist in this BST.
     * 
     * @param val The value to find in the BST
     * @return The Node containing the value if it exists in this BST, else null
     */
    protected Node findNode(E val) {
        if (val == null){
            return null;
        }
        return search(root, val);
    }


    private Node search(Node n, E target){
        if (n == null) return null;
        if (target.compareTo(n.value) == 0){
            return n;
        }else if (target.compareTo(n.value) > 0){
            return search(n.right, target);
        }else{
            return search(n.left, target);
        }
    }
    /**
     * Given a value, this method returns the depth of its Node, or -1 if the
     * value is null or does not exist in this BST. The depth is defined as the
     * number of edges from that node to the root.
     * 
     * @param val The value of the node from which to calculate depth
     * @return The number of edges from the node containing the given value in
     *         this BST to the root of the BST, or -1 if value does not exist
     *         in the BST
     */
    protected int depth(E val) {
        if (val == null){
            return -1;
        }else{
            return findDepth(root, val, 0);
        }
    }

    private int findDepth(Node n, E target, int depth){
        if (n == null) return -1;
        if (target.compareTo(n.value) == 0){
            return depth;
        }else if (target.compareTo(n.value) > 0){
            depth += 1;
            return findDepth(n.right, target, depth);
        }else{
            depth += 1;
            return findDepth(n.left, target, depth);
        }
    }

    /**
     * For the subtree rooted at the given Node, this method returns the height
     * of the subtree. The height of a subtree is defined as the maximum number
     * of edges between the root of the subtree and any descendant leaf. The
     * height of a leaf is 0. The height of an empty subtree, represented as a
     * null Node, is defined to be -1.
     * 
     * @param n Node representing a subtree rooted at that node
     * @return The height of the given subtree
     */
    protected static int height(BinarySearchTree<?>.Node n) {
        if (n == null) {
            return -1;
        }else{
            return findHeight(n, -1);
        }
    }

    private static int findHeight(BinarySearchTree<?>.Node n, int height){
        if (n == null){
            return height;
        }else{
            height += 1;
            int leftHeight = findHeight(n.left, height);
            int rightHeight = findHeight(n.right, height);
            return Math.max(leftHeight, rightHeight);
        }

    }

    /**
     * Given null, returns true. Given an instance of Node, returns true only if
     * the absolute value of the difference in heights of its left and right
     * children is less than 2.
     * 
     * @param n The node to test for balance
     * @return True only if node is null or is non-null and the absolute value
     *         of the difference in heights of its left and right children is
     *         less than 2
     */
    protected static boolean isBalancedNode(BinarySearchTree<?>.Node n) {
        if (n == null) {
            return true;
        }else{
            int heightDifference = Math.abs(height(n.left) - height(n.right));
            if (heightDifference < 2){
                return true;
            }else{
                return false;
            }
        }
    }

    /**
     * This method returns true only if isBalancedNode returns true for all
     * Nodes in this BST.
     * 
     * @return True only if the entire tree is balanced
     */
    public boolean isBalanced() {
        if (root == null){
            return true;
        }else {
            return traverseIsBalanced(root);
        }
    }

    private boolean traverseIsBalanced(Node n){
        boolean leftBalanced, rightBalanced;
        if (n.left != null) {
            leftBalanced = traverseIsBalanced(n.left);
        }else{
            leftBalanced = true;
        }
        if (n.right != null) {
            rightBalanced = traverseIsBalanced(n.right);
        }else{
            rightBalanced = true;
        }
        if (leftBalanced && rightBalanced && isBalancedNode(n)){
            return true;
        }else{
            return false;
        }

    }

    /**
     * OPTIONAL CHALLENGE: Produces the same result as isBalanced() but does so
     * in O(n) time.
     * 
     * Ungraded. Do not attempt until after you have a working isBalanced() for
     * grading.
     * 
     * @return True only if the entire tree is balanced
     */
    public boolean isBalancedFast() {
        return true;
    }
}
