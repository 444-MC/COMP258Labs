/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Laken
 */
public class ArrayManagerInClass {

    private int[] items;
    private int size = 0;

    // Constructor
    public ArrayManagerInClass() {
        items = new int[10];
    }

    public ArrayManagerInClass(int _size) {
        items = new int[_size];
    }

    public void print() {
//        for (int item : items) {
//            System.out.println(item + ",");
//        }
        for (int i = 0; i < size; i++) {
            System.out.println(items[i] + ",");
        }
    }

    public void add(int item) throws ArrayFullException {
        if (size >= items.length) {
            throw new ArrayFullException();
        }

        System.out.println("Size: " + size);
        items[size] = item;
        size += 1;
    }
}
