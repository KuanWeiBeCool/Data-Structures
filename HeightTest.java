package com.Week6;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HeightTest {
    protected BinarySearchTree<String> tree;

    public HeightTest() {
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
            int var1 = BinarySearchTree.height(this.tree.root.left.left.left);
            Assert.assertEquals("BinarySearchTree.height returns incorrect value when input node is leaf", 0L, (long)var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.height throws exception when input node is leaf: " + var2);
        }

    }

    @Test
    public void testB() {
        try {
            int var1 = BinarySearchTree.height(this.tree.root.left.left);
            Assert.assertEquals("BinarySearchTree.height returns incorrect value when input node is leaf", 1L, (long)var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.height throws exception when input node is leaf: " + var2);
        }

    }

    @Test
    public void testC() {
        try {
            int var1 = BinarySearchTree.height(this.tree.root.left);
            Assert.assertEquals("BinarySearchTree.height returns incorrect value when input node is leaf", 2L, (long)var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.height throws exception when input node is leaf: " + var2);
        }

    }

    @Test
    public void testD() {
        try {
            int var1 = BinarySearchTree.height(this.tree.root);
            Assert.assertEquals("BinarySearchTree.height returns incorrect value when input node is leaf", 4L, (long)var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.height throws exception when input node is leaf: " + var2);
        }

    }

    @Test
    public void testF() {
        try {
            int var1 = BinarySearchTree.height(this.tree.root.right);
            Assert.assertEquals("BinarySearchTree.height returns incorrect value when input node is leaf", 3L, (long)var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.height throws exception when input node is leaf: " + var2);
        }

    }

    @Test
    public void testE() {
        try {
            int var1 = BinarySearchTree.height(this.tree.root.right.left);
            Assert.assertEquals("BinarySearchTree.height returns incorrect value when input node is leaf", 0L, (long)var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.height throws exception when input node is leaf: " + var2);
        }

    }

    @Test
    public void testH() {
        try {
            int var1 = BinarySearchTree.height(this.tree.root.right.right);
            Assert.assertEquals("BinarySearchTree.height returns incorrect value when input node is leaf", 2L, (long)var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.height throws exception when input node is leaf: " + var2);
        }

    }

    @Test
    public void testG() {
        try {
            int var1 = BinarySearchTree.height(this.tree.root.right.right.left);
            Assert.assertEquals("BinarySearchTree.height returns incorrect value when input node is leaf", 0L, (long)var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.height throws exception when input node is leaf: " + var2);
        }

    }

    @Test
    public void testI() {
        try {
            int var1 = BinarySearchTree.height(this.tree.root.right.right.right);
            Assert.assertEquals("BinarySearchTree.height returns incorrect value when input node is leaf", 1L, (long)var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.height throws exception when input node is leaf: " + var2);
        }

    }

    @Test
    public void testJ() {
        try {
            int var1 = BinarySearchTree.height(this.tree.root.right.right.right.right);
            Assert.assertEquals("BinarySearchTree.height returns incorrect value when input node is leaf", 0L, (long)var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.height throws exception when input node is leaf: " + var2);
        }

    }

    @Test
    public void testNull() {
        try {
            int var1 = BinarySearchTree.height(null);
            Assert.assertEquals("BinarySearchTree.height returns incorrect value when input node is parent of two leaf nodes", -1L, (long)var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.height throws exception when input node is parent of two leaf nodes: " + var2);
        }

    }

    @Test
    public void testNull2() {
        try {
            int var1 = BinarySearchTree.height(this.tree.root.left.right);
            Assert.assertEquals("BinarySearchTree.height returns incorrect value when input node is parent of two leaf nodes", -1L, (long)var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.height throws exception when input node is parent of two leaf nodes: " + var2);
        }

    }
}

