/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.practice.labs.lab07;

/**
 *
 * @author Laken
 */
public class BSTNode<T extends Comparable<T>> {

    private T data;
    private BSTNode<T> left;
    private BSTNode<T> right;

    public BSTNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BSTNode<T> getLeft() {
        return left;
    }

    public void setLeft(BSTNode<T> left) {
        this.left = left;
    }

    public BSTNode<T> getRight() {
        return right;
    }

    public void setRight(BSTNode<T> right) {
        this.right = right;
    }

    public void add(T newData) {
        if (newData.compareTo(this.data) < 0) {
            if (this.left == null) {
                this.left = new BSTNode<>(newData);
            } else {
                this.left.add(newData);
            }
        } else if (newData.compareTo(this.data) > 0) {
            if (this.right == null) {
                this.right = new BSTNode<>(newData);
            } else {
                this.right.add(newData);
            }
        }
    }

    public boolean searchTree(T target) {
        if (target.equals(this.data)) {
            return true;
        }
        if (target.compareTo(this.data) < 0) {
            return this.left != null && this.left.searchTree(target);
        } else {
            return this.right != null && this.right.searchTree(target);
        }
    }

    public void printTree() {
        if (this.left != null) {
            this.left.printTree();
        }
        System.out.println(this.data);
        if (this.right != null) {
            this.right.printTree();
        }
    }

    public void printAscending() {
        if (this.left != null) {
            this.left.printAscending();
        }
        System.out.println(this.data);
        if (this.right != null) {
            this.right.printAscending();
        }
    }

    public void printDescending() {
        if (this.right != null) {
            this.right.printDescending();
        }
        System.out.println(this.data);
        if (this.left != null) {
            this.left.printDescending();
        }
    }

    public T getSmallest() {
        if (this.left == null) {
            return this.data;
        }
        return this.left.getSmallest();
    }

    public T getLargest() {
        if (this.right == null) {
            return this.data;
        }
        return this.right.getLargest();
    }
}
