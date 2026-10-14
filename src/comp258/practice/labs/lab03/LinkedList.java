/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.practice.labs.lab03;

/**
 *
 * @author Laken
 */
public class LinkedList {

    private ListNode items;
    private ListNode current;

    public LinkedList() {
        this.items = null;
        this.current = null;
    }

    public LinkedList(ListNode items, ListNode current) {
        this.items = items;
        this.current = current;
    }

    public ListNode getItems() {
        return items;
    }

    public void setItems(ListNode items) {
        this.items = items;
    }

    public Object getCurrent() {
        if (current == null) {
            return null;
        }
        return current.getData();
    }

    public void setCurrent(ListNode current) {
        this.current = current;
    }

    public void start() {
        current = items;
    }

    public void addAfter(Object item) {
        ListNode newNode = new ListNode(item);
        if (items == null) {
            items = newNode;
            current = items;
        } else if (current == null) {
            current = items;
            newNode.nextNode = current.nextNode;
            current.nextNode = newNode;
            current = newNode;
        } else {
            newNode.nextNode = current.nextNode;
            current.nextNode = newNode;
            current = newNode;
        }
    }

    public void addBefore(Object item) {
        ListNode newNode = new ListNode(item);
        if (items == null) {
            items = newNode;
            current = items;
        } else if (current == items || current == null) {
            newNode.nextNode = items;
            items = newNode;
            current = newNode;
        } else {
            ListNode prev = items;
            while (prev != null && prev.nextNode != current) {
                prev = prev.nextNode;
            }
            if (prev != null) {
                newNode.nextNode = current;
                prev.nextNode = newNode;
                current = newNode;
            }
        }
    }

    public boolean advance() {
        if (current != null && current.nextNode != null) {
            current = current.nextNode;
            return true;
        }
        return false;
    }

    public void deleteCurrent() {
        if (current == null || items == null) {
            return;
        }

        if (current == items) {
            items = items.nextNode;
            current = items;
        } else {
            ListNode prev = items;
            while (prev != null && prev.nextNode != current) {
                prev = prev.nextNode;
            }
            if (prev != null) {
                prev.nextNode = current.nextNode;
                current = current.nextNode;
            }
        }
    }

    public Object getItemAt(int index) {
        ListNode temp = items;
        int count = 0;
        while (temp != null) {
            if (count == index) {
                return temp.getData();
            }
            count++;
            temp = temp.nextNode;
        }
        return null;
    }

    public void print() {
        ListNode temp = items;
        System.out.print("[ ");
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.nextNode;
        }
        System.out.println("]");
    }
}
