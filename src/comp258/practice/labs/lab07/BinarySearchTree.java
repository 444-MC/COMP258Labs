/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.practice.labs.lab07;

/**
 *
 * @author Laken
 */
public class BinarySearchTree<T extends Comparable<T>> {

    private BSTNode<T> root;
    private int size;

    public BinarySearchTree() {
        this.root = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void add(T newData) {
        if (root == null) {
            root = new BSTNode<>(newData);
        } else {
            root.add(newData);
        }
        size++;
    }

    public boolean searchTree(T target) {
        if (root == null) {
            return false;
        }
        return root.searchTree(target);
    }

    public void printTree() {
        if (root != null) {
            root.printAscending();
        } else {
            System.out.println("Tree is empty.");
        }
    }

    public void printDescending() {
        if (root != null) {
            root.printDescending();
        } else {
            System.out.println("Tree is empty.");
        }
    }

    public void printSmallest() {
        if (root != null) {
            System.out.println("Smallest item: " + root.getSmallest());
        } else {
            System.out.println("Tree is empty.");
        }
    }

    public void printLargest() {
        if (root != null) {
            System.out.println("Largest item: " + root.getLargest());
        } else {
            System.out.println("Tree is empty.");
        }
    }

    public T getSmallest() {
        return root != null ? root.getSmallest() : null;
    }

    public T getLargest() {
        return root != null ? root.getLargest() : null;
    }
}
