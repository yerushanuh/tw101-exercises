package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node rightChild;
    private Node leftChild;

    public Node(String name) {
        this.name = name;
        this.rightChild = null;
        this.leftChild = null;
    }

    public void add(String nameOfNewNode) {
        if (nameOfNewNode.equals(this.name)) {
        }
        else if (nameOfNewNode.compareTo(this.name) < 0) {
            if (this.leftChild == null) {
                this.leftChild = new Node(nameOfNewNode);
            }
            else {
                this.leftChild.add(nameOfNewNode);
            }
        }
        else if (nameOfNewNode.compareTo(this.name) > 0) {
            if (this.rightChild == null) {
                this.rightChild = new Node(nameOfNewNode);
            }
            else {
                this.rightChild.add(nameOfNewNode);
            }
        }
    }

    public List<String> names() {
        List<String> list = new ArrayList<String>();
        traverse(list);
        return list;
    }

    private void traverse(List<String> list) {
        if (this.leftChild != null) {
            this.leftChild.traverse(list);
        }

        list.add(this.name);

        if (this.rightChild != null) {
            this.rightChild.traverse(list);
        }
    }
}
