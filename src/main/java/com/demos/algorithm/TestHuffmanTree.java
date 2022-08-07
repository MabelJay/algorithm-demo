package com.demos.algorithm;

import java.util.ArrayList;
import java.util.List;

public class TestHuffmanTree {
    public static void main(String[] args) {
        List<HuffmanTree.BinaryTreeNode<String>> binaryTreeNodes = new ArrayList<>();
        binaryTreeNodes.add(new HuffmanTree.BinaryTreeNode<>("A", "5"));
        binaryTreeNodes.add(new HuffmanTree.BinaryTreeNode<>("B", "15"));
        binaryTreeNodes.add(new HuffmanTree.BinaryTreeNode<>("C", "40"));
        binaryTreeNodes.add(new HuffmanTree.BinaryTreeNode<>("D", "30"));
        binaryTreeNodes.add(new HuffmanTree.BinaryTreeNode<>("E", "10"));

        HuffmanTree<String> huffmanTree = HuffmanTree.build(binaryTreeNodes);
//        HuffmanTree.BinaryTreeNode<String> root = huffmanTree.getRoot();

        treeTraverse(huffmanTree.getRoot());
    }

    public static void treeTraverse(HuffmanTree.BinaryTreeNode<String> root) {
        if (root == null) return;
        System.out.println(root.data);
        treeTraverse(root.left);
        treeTraverse(root.right);
    }
}
