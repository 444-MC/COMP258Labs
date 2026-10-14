/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.collections;

/**
 *
 * @author Laken
 */
public class ListNode<T> {
    public T data;
    public ListNode<T> next;

    public ListNode(T data) {
        this.data = data;
        this.next = null;
    }
}
