package com.Week6;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsBalancedNodeTest {
    protected BinarySearchTree<String> tree;

    public IsBalancedNodeTest() {
    }

    @Before
    public void setUp() throws Exception {
        this.tree = new BinarySearchTree();
        this.tree.add("d");
        this.tree.add("c");
        this.tree.add("b");
        this.tree.add("a");
        this.tree.add("f");
        this.tree.add("e");
        this.tree.add("h");
        this.tree.add("g");
        this.tree.add("i");
        this.tree.add("j");
    }


    @Test
    public void testA() {
        try {
            boolean var1 = BinarySearchTree.isBalancedNode(this.tree.root.left.left.left);
            Assert.assertTrue("BinarySearchTree.isBalancedNode returns incorrect value when input node is leaf",var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.isBalancedNode throws exception when input node is leaf: " + var2);
        }

    }

    @Test
    public void testB() {
        try {
            boolean var1 = BinarySearchTree.isBalancedNode(this.tree.root.left.left);
            Assert.assertTrue("BinarySearchTree.isBalancedNode returns incorrect value when input node is leaf",var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.isBalancedNode throws exception when input node is leaf: " + var2);
        }

    }

    @Test
    public void testC() {
        try {
            boolean var1 = BinarySearchTree.isBalancedNode(this.tree.root.left);
            Assert.assertFalse("BinarySearchTree.isBalancedNode returns incorrect value when input node is leaf",var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.isBalancedNode throws exception when input node is leaf: " + var2);
        }

    }

    @Test
    public void testD() {
        try {
            boolean var1 = BinarySearchTree.isBalancedNode(this.tree.root);
            Assert.assertTrue("BinarySearchTree.isBalancedNode returns incorrect value when input node is leaf",var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.isBalancedNode throws exception when input node is leaf: " + var2);
        }

    }

    @Test
    public void testF() {
        try {
            boolean var1 = BinarySearchTree.isBalancedNode(this.tree.root.right);
            Assert.assertFalse("BinarySearchTree.isBalancedNode returns incorrect value when input node is leaf",var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.isBalancedNode throws exception when input node is leaf: " + var2);
        }

    }

    @Test
    public void testE() {
        try {
            boolean var1 = BinarySearchTree.isBalancedNode(this.tree.root.right.left);
            Assert.assertTrue("BinarySearchTree.isBalancedNode returns incorrect value when input node is leaf",var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.isBalancedNode throws exception when input node is leaf: " + var2);
        }

    }

    @Test
    public void testH() {
        try {
            boolean var1 = BinarySearchTree.isBalancedNode(this.tree.root.right.right);
            Assert.assertTrue("BinarySearchTree.isBalancedNode returns incorrect value when input node is leaf",var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.isBalancedNode throws exception when input node is leaf: " + var2);
        }

    }

    @Test
    public void testG() {
        try {
            boolean var1 = BinarySearchTree.isBalancedNode(this.tree.root.right.right.left);
            Assert.assertTrue("BinarySearchTree.isBalancedNode returns incorrect value when input node is leaf",var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.isBalancedNode throws exception when input node is leaf: " + var2);
        }

    }

    @Test
    public void testI() {
        try {
            boolean var1 = BinarySearchTree.isBalancedNode(this.tree.root.right.right.right);
            Assert.assertTrue("BinarySearchTree.isBalancedNode returns incorrect value when input node is leaf",var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.isBalancedNode throws exception when input node is leaf: " + var2);
        }

    }

    @Test
    public void testJ() {
        try {
            boolean var1 = BinarySearchTree.isBalancedNode(this.tree.root.right.right.right.right);
            Assert.assertTrue("BinarySearchTree.isBalancedNode returns incorrect value when input node is leaf",var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.isBalancedNode throws exception when input node is leaf: " + var2);
        }

    }

    @Test
    public void testNull() {
        try {
            boolean var1 = BinarySearchTree.isBalancedNode(null);
            Assert.assertTrue("BinarySearchTree.isBalancedNode returns incorrect value when input node is parent of two leaf nodes",var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.isBalancedNode throws exception when input node is parent of two leaf nodes: " + var2);
        }

    }
}

