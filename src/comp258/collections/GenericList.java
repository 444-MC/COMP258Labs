/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.collections;

/**
 *
 * @author Laken
 * @param <T>
 */
public class GenericList<T extends Comparable<T>> {

    private ListNode<T> head;
    private ListNode<T> current;

    public GenericList() {
        this.head = null;
        this.current = null;
    }

    public void addAfter(T item) {
        ListNode<T> newNode = new ListNode<>(item);
        if (head == null) {
            head = newNode;
            current = head;
        } else {
            newNode.next = current.next;
            current.next = newNode;
            current = newNode;
        }
    }

    public void addBefore(T item) {
        ListNode<T> newNode = new ListNode<>(item);
        if (head == null || current == head) {
            newNode.next = head;
            head = newNode;
            current = head;
        } else {
            ListNode<T> temp = head;
            while (temp != null && temp.next != current) {
                temp = temp.next;
            }
            if (temp != null) {
                newNode.next = current;
                temp.next = newNode;
                current = newNode;
            }
        }
    }

    public T getCurrent() {
        if (current == null) {
            return null;
        }
        return current.data;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        ListNode<T> temp = head;
        System.out.print("[ ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("]");
    }

    public T getMaximum() {
        if (head == null) {
            return null;
        }

        ListNode<T> maxNode = head;
        ListNode<T> temp = head.next;

        while (temp != null) {
            if (temp.data.compareTo(maxNode.data) > 0) {
                maxNode = temp;
            }
            temp = temp.next;
        }

        current = maxNode;

        return maxNode.data;
    }

    public void advance() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    public void remove() {
        if (head == null || current == null) {
            return;
        }

        if (current == head) {
            head = head.next;
            current = head;
        } else {
            ListNode<T> temp = head;
            while (temp != null && temp.next != current) {
                temp = temp.next;
            }
            if (temp != null) {
                temp.next = current.next;
                current = temp.next != null ? temp.next : head;
            }
        }
    }

    public void printBackwards() {
        printBackwardsRecursive(head);
    }

    private void printBackwardsRecursive(ListNode<T> node) {
        if (node == null) {
            return;
        }

        printBackwardsRecursive(node.next);
        System.out.print(node.data + " ");
    }
}
