package com.hsj.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {
    private BinaryTree<String> binaryTree;
    @Before
    public void setBinaryTree() {
        binaryTree = new BinaryTree<>();
    }

    @Test
    public void getSize() {
        System.out.println(binaryTree.getSize());
    }

    @Test
    public void isEmpty() {
        System.out.println(binaryTree.isEmpty());
    }

    @Test
    public void add() {
        binaryTree.add("hsj");
    }

    @Test
    public void addsimplify() {
        binaryTree.add("dsa");

    }

    @Test
    public void contains() {
        System.out.println(binaryTree.contains("hsj"));
    }

    @Test
    public void preOrder() {
    }

    @Test
    public void preOrderNR() {
    }

    @Test
    public void inOrder() {
    }

    @Test
    public void postOrder() {
    }

    @Test
    public void levelOrder() {
    }

    @Test
    public void minmum() {
    }

    @Test
    public void maxmum() {
    }

    @Test
    public void removeMin() {
    }

    @Test
    public void removeMax() {
    }

    @Test
    public void remove() {
    }
}