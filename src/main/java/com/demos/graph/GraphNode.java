package com.demos.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphNode<T> {
    T data;
    List<GraphNode<T>> neighborList;
    boolean visited;

    public GraphNode(T data) {
        this.data = data;
        neighborList = new ArrayList<>();
        visited = false;
    }

    public boolean equals(GraphNode<T> obj) {
        return this.data.equals(obj.data);
    }

    public void restoreVisited() {
        restoreVisited(this);
    }

    public void restoreVisited(GraphNode<T> node) {
        if (node.visited) {
            node.visited = false;
        }

        List<GraphNode<T>> neighbors = node.neighborList;
        for (int i = 0; i < neighbors.size(); i++) {
            restoreVisited(neighbors.get(i));
        }
    }
}
