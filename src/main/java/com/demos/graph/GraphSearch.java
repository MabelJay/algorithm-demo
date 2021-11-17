package com.demos.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphSearch<T> {
    StringBuilder dfsPathBuilder = new StringBuilder();
    StringBuilder bfsPathBuilder = new StringBuilder();

    public static void main(String[] args) {
        GraphNode<String> node1 = new GraphNode<>("A");
        GraphNode<String> node2 = new GraphNode<>("B");
        GraphNode<String> node3 = new GraphNode<>("C");
        GraphNode<String> node4 = new GraphNode<>("D");
        GraphNode<String> node5 = new GraphNode<>("E");
        GraphNode<String> node6 = new GraphNode<>("F");
        GraphNode<String> node7 = new GraphNode<>("G");

        node1.neighborList.add(node3);
        node1.neighborList.add(node4);
        node1.neighborList.add(node6);

        node3.neighborList.add(node4);
        node3.neighborList.add(node1);
        node3.neighborList.add(node2);

        node4.neighborList.add(node1);
        node4.neighborList.add(node3);

        node2.neighborList.add(node3);

        node6.neighborList.add(node1);
        node6.neighborList.add(node7);

        node7.neighborList.add(node6);
        node7.neighborList.add(node5);

        node5.neighborList.add(node7);

        GraphSearch<String> graphSearch = new GraphSearch<>();
//        graphSearch.dfsSearch(node1);

//        System.out.println(graphSearch.dfsPathBuilder.toString());


        graphSearch.bfsSearch(node1);
        System.out.println(graphSearch.bfsPathBuilder.toString());
    }

    public void dfsSearch(GraphNode<T> root) {
        if (root == null) return;

        if (dfsPathBuilder.length() > 0) {
            dfsPathBuilder.append("->");
        }

        dfsPathBuilder.append(root.data.toString());
        root.visited = true;

        for (GraphNode<T> neighbor : root.neighborList) {
            if (!neighbor.visited) {
                dfsSearch(neighbor);
            }
        }
    }

    public void bfsSearch(GraphNode<T> root) {
        LinkedList<GraphNode<T>> queue = new LinkedList<>();

        if (bfsPathBuilder.length() > 0) {
            bfsPathBuilder.append("->");
        }

        bfsPathBuilder.append(root.data.toString());
        root.visited = true;

        // add it to queue
        queue.offer(root);

        while (!queue.isEmpty()) {
            GraphNode<T> node = queue.poll();

            for (GraphNode<T> neighbor : node.neighborList) {
                if (!neighbor.visited) {
                    bfsPathBuilder.append("->");
                    bfsPathBuilder.append(neighbor.data.toString());
                    neighbor.visited = true;

                    queue.offer(neighbor);
                }
            }
        }
    }
}
