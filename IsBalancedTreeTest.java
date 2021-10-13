package com.Week6;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsBalancedTreeTest {
    protected BinarySearchTree<String> tree;

    public IsBalancedTreeTest() {
    }

    @Before
    public void setUp() throws Exception {
        this.tree = new BinarySearchTree();
        this.tree.add("b");
        this.tree.add("a");

    }

    @Test
    public void testRootAndTwoChildren() {
        try {
            boolean var1 = this.tree.isBalanced();
            Assert.assertTrue("BinarySearchTree.isBalanced returns incorrect value when only nodes are root of tree and its two children", var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.isBalanced throws exception when only nodes are root of tree and its two children: " + var2);
        }

    }
}
