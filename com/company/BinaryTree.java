package com.company;

public class BinaryTree {
    public Node root = new Node();
    public class Node {
        int value;
        Node left;
        Node right;
    }
    public Node creatNewNode(int k) {
        Node a = new Node();
        a.value = k;
        a.left = new Node();
        a.right = new Node();
        return a;
    }
    public Node addElement(int val){
        Node node = root;
        if (node == null) return  creatNewNode(val);
        return node;
    }

    boolean searchElement(int key) {
        Node element = root;
        element.left = new Node();
        element.right = new Node();
        while (element != null) {
            if (element.value == key) return true;
            else if (element.value < key) element = element.left;
            else if (element.value > key) element = element.right;
        }
        return false;
    }

    public boolean leftElement(int key) {
        Node element = root;
        element.left = new Node();
        element.right = new Node();
        while (element != null) {
            if (element.value == key) return true;
            else if (element.value < key) element = element.left;
            else if (element.value > key) element = element.right;
        }
        return false;
    }

    boolean rightElement(int key) {
        Node element = root;
        element.left = new Node();
        element.right = new Node();
        while (element != null) {
            if (element.value == key) return true;
            else if (element.value < key) element = element.left;
            else if (element.value > key) element = element.right;
        }
        return false;
    }
    public boolean deleteElement(int key) {
        Node element = root;
        while (element != null) {
            if (element.value == key) return true;
            else if (element.value > key && element.left == null) return true;
            else if (element.value < key && element.right == null) return true;
        }
        return false;
    }
}