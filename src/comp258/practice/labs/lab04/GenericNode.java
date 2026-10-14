/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.practice.labs.lab04;

/**
 *
 * @author Laken
 */
public class GenericNode<T> {

    private T data;
    public GenericNode next;

    public GenericNode() {
    }

    public GenericNode(T data) {
        this.data = data;
    }

//    public GenericNode(T data, GenericNode next) {
//        this.data = data;
//        this.next = next;
//    }
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

//    public GenericNode getNext() {
//        return next;
//    }
//
//    public void setNext(GenericNode next) {
//        this.next = next;
//    }
}
