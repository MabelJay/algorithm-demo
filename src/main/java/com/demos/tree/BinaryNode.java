package com.demos.tree;

public class BinaryNode {
   Object nodeElement;
   BinaryNode left;
   BinaryNode right;

   public BinaryNode(Object nodeElement) {
       this.nodeElement = nodeElement;
       left = null;
       right = null;
   }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }
}
