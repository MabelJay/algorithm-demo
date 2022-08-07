package com.demos.algorithm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TestBigDecimal {
    public static void main(String[] args) {
        /*String s1 = "1.11";
        System.out.println(new BigDecimal(s1).subtract(new BigDecimal(1.12)));*/

        TestBigDecimal decimal = new TestBigDecimal();
        HuffmanTree2<String> huffmanTree2 = decimal.testHuffmanTree();
        decimal.treeTraverse(huffmanTree2.getRoot());
    }

    public HuffmanTree2<String> testHuffmanTree() {
        List<HuffmanTree2.BinaryNodeTree<String>> binaryNodeTrees = new ArrayList<>();
        binaryNodeTrees.add(new HuffmanTree2.BinaryNodeTree<>("A", "5"));
        binaryNodeTrees.add(new HuffmanTree2.BinaryNodeTree<>("B", "15"));
        binaryNodeTrees.add(new HuffmanTree2.BinaryNodeTree<>("C", "40"));
        binaryNodeTrees.add(new HuffmanTree2.BinaryNodeTree<>("D", "30"));
        binaryNodeTrees.add(new HuffmanTree2.BinaryNodeTree<>("E", "10"));

        HuffmanTree2 huffmanTree2 = HuffmanTree2.build(binaryNodeTrees);
        return huffmanTree2;
    }

    public void treeTraverse(HuffmanTree2.BinaryNodeTree<String> root) {
        if (root == null) return;
        if (root.data != null) {
            System.out.println("node is: " + root.data);
        } else {
            System.out.println("root node");
        }
        treeTraverse(root.left);
        treeTraverse(root.right);
    }
}
