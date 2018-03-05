package com.company;

public class BinaryTree {
    private Node root;
    private class Node {
        int value;
        Node left;
        Node right;
    }
    public boolean searchElement(int key) {
        Node element = root;
        while (element != null) {
            if (element.value == key) return true;
            else if(element.value < key) element = element.left;
            else if(element.value > key) element = element.right;
        }
        return false;
    }
    public int leftElement(int key){
        Node element = root;
        while (element != null){
            if (element.value == key) return element.left.value;
            else if(element.value < key) element = element.left;
            else if(element.value > key) element = element.right;
        }
        return element.value;
    }
    public int rightElement(int key){
        Node element = root;
        while (element != null){
            if (element.value == key) return element.right.value;
            else if(element.value < key) element = element.left;
            else if(element.value > key) element = element.right;
        }
        return element.value;
    }
    public Node addElement(Node key){
        Node element = root;
        while (element != null){
            if (element.value > key.value) {
                element = element.left;
                if (element.value > key.value && element.left == null) element.left = key;
                if (element.value < key.value && element.right == null) element.right = key;
            }
            if (element.value < key.value) {
                element = element.right;
                if (element.value > key.value && element.left == null) element.left = key;
                if (element.value < key.value && element.right == null) element.right = key;
            }
        }
        return element;
    }
    public Node deleteElement(int key) {
        Node element = root;
        while (element != null) {
            if (element.value == key) {
              if (element.left == null) element = element.right;
              else if (element.right == null) element = element.left;
              else element = element.right;
            }
        }
        return element;
    }
}