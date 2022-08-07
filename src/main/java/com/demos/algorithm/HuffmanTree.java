package com.demos.algorithm;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;

public class HuffmanTree<E> {

    private BinaryTreeNode<E> root;

    public static class BinaryTreeNode<E> {
        E data;
        String weight;
        BinaryTreeNode<E> left;
        BinaryTreeNode<E> right;

        public BinaryTreeNode(E data, String weight) {
            this.data = data;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "BinaryTreeNode{" +
                    "data=" + data +
                    ", weight='" + weight + '\'' +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    public static <E> HuffmanTree<E> build(List<BinaryTreeNode<E>> binaryTreeNodes) {
        Comparator<BinaryTreeNode<E>> comparator = (o1, o2) -> new BigDecimal(o1.weight).subtract(new BigDecimal(o2.weight)).intValue();
        while (binaryTreeNodes.size() > 1) {
            binaryTreeNodes.sort(comparator);

            BinaryTreeNode<E> left = binaryTreeNodes.remove(0);
            BinaryTreeNode<E> right = binaryTreeNodes.remove(0);
            BinaryTreeNode<E> parent = new BinaryTreeNode<>(null, new BigDecimal(left.weight).add(new BigDecimal(right.weight)).toString());
            parent.left = left;
            parent.right = right;
            binaryTreeNodes.add(parent);
        }
        HuffmanTree<E> huffmanTree = new HuffmanTree<>();
        huffmanTree.root = binaryTreeNodes.remove(0);
        return huffmanTree;
    }

    public BinaryTreeNode<E> getRoot() {
        return root;
    }
}
