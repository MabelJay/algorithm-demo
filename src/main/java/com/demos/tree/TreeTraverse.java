package com.demos.tree;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;

public class TreeTraverse {

    public static void main(String[] args) {
        BinaryNode node1 = new BinaryNode(1);
        BinaryNode node2 = new BinaryNode(2);
        BinaryNode node3 = new BinaryNode(3);
        BinaryNode node4 = new BinaryNode(4);
        BinaryNode node5 = new BinaryNode(5);

        node1.setLeft(node2);
        node1.setRight(node3);
        node3.setLeft(node4);
        node3.setRight(node5);

//        preOrderTraverse(node1);
//        System.out.println();
//        midOrderTraverse(node1);
//        System.out.println();
        levelTraverse(node1);
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

    public static void levelTraverse(BinaryNode node) {
        if (node == null) return;
        LinkedList<BinaryNode> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            BinaryNode tmpNode = queue.poll();
            System.out.println("current node is: " + tmpNode.nodeElement);
            if (tmpNode.left != null) {
                queue.offer(tmpNode.left);
            }
            if (tmpNode.right != null) {
                queue.offer(tmpNode.right);
            }
        }
    }
}
