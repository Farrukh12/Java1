package com.company;

public class BinaryTree {
    private Node root = new Node();
    private class Node {
        int value;
        Node left;
        Node right;
    }
    boolean searchElement(int key) {
        Node element = root;
        if (element.value == 0) element.value = key;
        while (element != null) {
            if (element.value == key) return true;
            else if(element.value < key) element = element.left;
            else if(element.value > key) element = element.right;
        }
        return false;
    }
    public int leftElement(int key){
        Node element = root;
        element.left = new Node();
        element.right = new Node();
        while (element != null){
            if (element.value == key) return element.left.value;
            else if(element.value < key) element = element.left;
            else if(element.value > key) element = element.right;
        }
        return element.value;
    }
    int rightElement(int key){
        Node element = root;
        element.left = new Node();
        element.right = new Node();
        while (element != null){
            if (element.value == key) return element.right.value;
            else if(element.value < key) element = element.left;
            else if(element.value > key) element = element.right;
        }
        return element.value;
    }
    Node addElement(int key){
        Node element = root;
        element.left = new Node();
        element.right = new Node();
        while (element.value != 0){
            if (element.value > key && element.left == null) element.right.value = key;
            if (element.value < key && element.right == null) element.left.value = key;
            if (key > element.value) {
                element = element.right;
                if (element.value > key && element.left == null) element.right.value = key;
                if (element.value < key && element.right == null) element.left.value = key;
            }
            else if (key < element.value) {
                element = element.left;
                if (element.value > key && element.left == null) element.right.value = key;
                if (element.value < key && element.right == null) element.left.value = key;
            }
        }
        return element;
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