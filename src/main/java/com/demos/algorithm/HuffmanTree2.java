package com.demos.algorithm;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;

public class HuffmanTree2<E> {

    private BinaryNodeTree root;

    public static class BinaryNodeTree<E> {
        E data;
        BinaryNodeTree left;
        BinaryNodeTree right;
        String weight;

        public BinaryNodeTree(E data, String weight) {
            this.data = data;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "BinaryNodeTree{" +
                    "data=" + data +
                    ", left=" + left +
                    ", right=" + right +
                    ", weight='" + weight + '\'' +
                    '}';
        }
    }

    public static <E> HuffmanTree2<E> build(List<BinaryNodeTree<E>> binaryNodeTrees) {
        Comparator<BinaryNodeTree<E>> comparator = (o1, o2) -> new BigDecimal(o1.weight).subtract(new BigDecimal(o2.weight)).intValue();
        while (binaryNodeTrees.size() > 1) {
            binaryNodeTrees.sort(comparator);

            BinaryNodeTree left = binaryNodeTrees.remove(0);
            BinaryNodeTree right = binaryNodeTrees.remove(0);

            BinaryNodeTree<E> parent = new BinaryNodeTree<>(null, new BigDecimal(left.weight).add(new BigDecimal(right.weight)).toString());
            parent.left = left;
            parent.right = right;

            binaryNodeTrees.add(parent);
        }
        HuffmanTree2<E> huffmanTree2 = new HuffmanTree2<>();
        huffmanTree2.root = binaryNodeTrees.remove(0);
        return huffmanTree2;
    }

    public BinaryNodeTree getRoot() {
        return root;
    }
}
