package com.demos.tree;

public class TreeTraverse {

    public static void main(String[] args) {
        BinaryNode node1 = new BinaryNode(1);
        BinaryNode node2 = new BinaryNode(2);
        BinaryNode node3 = new BinaryNode(3);
        BinaryNode node4 = new BinaryNode(4);

        node1.setLeft(node2);
        node1.setRight(node3);
        node3.setLeft(node4);

        preOrderTraverse(node1);
        System.out.println();
        midOrderTraverse(node1);
        System.out.println();
        postOrderTraverse(node1);
    }

    // pre-order traverse for binary tree
    public static void preOrderTraverse(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.nodeElement);
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);
    }

    // mid-order traverse for binary tree
    public static void midOrderTraverse(BinaryNode node) {
        if (node == null) return;

        midOrderTraverse(node.left);
        System.out.println(node.nodeElement);
        midOrderTraverse(node.right);

    }

    // post order traverse for binary tree
    public static void postOrderTraverse(BinaryNode node) {
        if (node == null) return;
        postOrderTraverse(node.left);
        postOrderTraverse(node.right);
        System.out.println(node.nodeElement);
    }
}
