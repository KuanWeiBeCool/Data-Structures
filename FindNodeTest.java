package com.Week6;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.Week6.BinarySearchTree.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindNodeTest {
    protected BinarySearchTree<String> tree;

    public FindNodeTest() {
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
    public void testTargetIsRoot() {
        try {
            Node var1 = this.tree.findNode("d");
            if (var1 == null) {
                Assert.fail("BinarySearchTree.findNode returned null when looking for value that is root");
            }

            Assert.assertEquals("BinarySearchTree.findNode returned incorrect Node when looking for value that is root", "d", var1.value);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.findNode throws exception when target is root: " + var2);
        }

    }

    @Test
    public void testTargetIsLeftChildOfRoot() {
        try {
            Node var1 = this.tree.findNode("c");
            if (var1 == null) {
                Assert.fail("BinarySearchTree.findNode returned null when looking for value that is left child of root");
            }

            Assert.assertEquals("BinarySearchTree.findNode returned incorrect Node when looking for value that is left child of root", "c", var1.value);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.findNode throws exception when target is left child of root: " + var2);
        }

    }

    @Test
    public void testTargetIsRightChildOfRoot() {
        try {
            Node var1 = this.tree.findNode("b");
            if (var1 == null) {
                Assert.fail("BinarySearchTree.findNode returned null when looking for value that is right child of root");
            }

            Assert.assertEquals("BinarySearchTree.findNode returned incorrect Node when looking for value that is right child of root", "b", var1.value);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.findNode throws exception when target is right child of root: " + var2);
        }

    }

    @Test
    public void testNull() {
        try {
            Node var1 = this.tree.findNode(null);
            Assert.assertEquals(var1, null);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.findNode throws exception when target is root: " + var2);
        }

    }

    @Test
    public void testNotExist() {
        try {
            Node var1 = this.tree.findNode("j");
            Assert.assertEquals(var1, null);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.findNode throws exception when target is root: " + var2);
        }

    }
}
