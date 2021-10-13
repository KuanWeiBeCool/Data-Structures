package com.Week6;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.Week6.BinarySearchTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DepthTest {
    protected BinarySearchTree<String> tree;

    public DepthTest() {
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
    }

    @Test
    public void testRoot() {
        try {
            int var1 = this.tree.depth("d");
            Assert.assertEquals("BinarySearchTree.depth returns incorrect value when input value is root", 0L, (long)var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.depth throws exception when input is root: " + var2);
        }

    }

    @Test
    public void testLeftChildOfRoot() {
        try {
            int var1 = this.tree.depth("c");
            Assert.assertEquals("BinarySearchTree.depth returns incorrect value when input value is left child of root", 1L, (long)var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.depth throws exception when input is left child of root: " + var2);
        }

    }

    @Test
    public void testRightChildOfRoot() {
        try {
            int var1 = this.tree.depth("f");
            Assert.assertEquals("BinarySearchTree.depth returns incorrect value when input value is right child of root", 1L, (long)var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.depth throws exception when input is right child of root: " + var2);
        }

    }

    @Test
    public void testA() {
        try {
            int var1 = this.tree.depth("a");
            Assert.assertEquals("BinarySearchTree.depth returns incorrect value when input value is left leaf", 3L, (long)var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.depth throws exception when input is right child of root: " + var2);
        }

    }

    @Test
    public void testB() {
        try {
            int var1 = this.tree.depth("b");
            Assert.assertEquals("BinarySearchTree.depth returns incorrect value when input value is left leaf", 2L, (long)var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.depth throws exception when input is right child of root: " + var2);
        }

    }

    @Test
    public void testE() {
        try {
            int var1 = this.tree.depth("e");
            Assert.assertEquals("BinarySearchTree.depth returns incorrect value when input value is left leaf", 2L, (long)var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.depth throws exception when input is right child of root: " + var2);
        }

    }

    @Test
    public void testH() {
        try {
            int var1 = this.tree.depth("h");
            Assert.assertEquals("BinarySearchTree.depth returns incorrect value when input value is left leaf", 2L, (long)var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.depth throws exception when input is right child of root: " + var2);
        }

    }

    @Test
    public void testG() {
        try {
            int var1 = this.tree.depth("g");
            Assert.assertEquals("BinarySearchTree.depth returns incorrect value when input value is left leaf", 3L, (long)var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.depth throws exception when input is right child of root: " + var2);
        }

    }

    @Test
    public void testI() {
        try {
            int var1 = this.tree.depth("i");
            Assert.assertEquals("BinarySearchTree.depth returns incorrect value when input value is left leaf", 3L, (long)var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.depth throws exception when input is right child of root: " + var2);
        }

    }

    @Test
    public void testEmpty() {
        try {
            int var1 = this.tree.depth(null);
            Assert.assertEquals("BinarySearchTree.depth returns incorrect value when input value is null", -1L, (long)var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.depth throws exception when input is right child of root: " + var2);
        }
    }

    @Test
    public void testNotExist() {
        try {
            int var1 = this.tree.depth("j");
            Assert.assertEquals("BinarySearchTree.depth returns incorrect value when input does not exist", -1L, (long)var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.depth throws exception when input is right child of root: " + var2);
        }
    }
}
