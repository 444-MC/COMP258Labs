/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labs.lab03;

/**
 *
 * @author Laken
 */
public class LinkedListPart2 {

    private ListNode items;
    private ListNode current;

    public LinkedListPart2() {
        this.items = null;
        this.current = null;
    }

    public LinkedListPart2(ListNode items, ListNode current) {
        this.items = items;
        this.current = current;
    }

    public ListNode getItems() {
        return items;
    }

    public void setItems(ListNode items) {
        this.items = items;
    }

    public ListNode getCurrent() {
        return current;
    }

    public void setCurrent(ListNode current) {
        this.current = current;
    }
    

    //  Add checks to see if this is the first item added.  
    //  If it is, it assigns it to items 
    //  If it’s not, it assigns it after current, then makes item the current 
    public void add(Object item) {
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
