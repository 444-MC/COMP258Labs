/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.practice.labs.lab03;

/**
 *
 * @author Laken
 */
public class ListNode {

    private Object data;
    public ListNode nextNode;

    public ListNode(Object item) {
        this.data = item;
        this.nextNode = null;
    }

    public ListNode(Object data, ListNode nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public ListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(ListNode nextNode) {
        this.nextNode = nextNode;
    }
    
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
