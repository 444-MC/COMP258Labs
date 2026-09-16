
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Laken
 */
public class ArrayManager {

    private int[] items;
    private int count;

    // Constructors
    // Creates an empty ArrayManager. Set count to 0 and create an items array with a capacity of 10. 
    public ArrayManager() {
        count = 0;
        items = new int[10];
    }

    // Creates an empty ArrayManager with an items array of the specified capacity. Set count to 0.
    public ArrayManager(int capacity) {
        count = 0;
        items = new int[capacity];
    }

    // Creates an ArrayManager initialized with the integers contained in values. Set count appropriately. 
    public ArrayManager(int[] values) {
        items = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            items[i] = values[i];
        }

        count = values.length;
    }

    // Methods
    // Returns the number of items currently stored in the ArrayManager
    public int size() {
        return count;
    }

    // Displays all items currently stored in the ArrayManager
    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    // Adds n to the end of the items currently stored in the ArrayManager.
    public void add(int n) {
        if (count >= items.length) {
            System.out.println("Error: Array is full!");
            return;
        }
        items[count] = n;
        count++;
    }

    // Removes the item at index pos. Any items appearing after the removed item must be shifted one position to the left so that there are no gaps in the collection
    public void remove(int pos) throws NoItemsException {
        if (count == 0 || pos < 0 || pos >= count) {
            throw new NoItemsException();
        }
        for (int i = pos; i < count - 1; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public void addAt(int n, int pos) throws OutOfBoundsException {
        if (pos < 0 || pos > count || count >= items.length) {
            throw new OutOfBoundsException();
        }

        for (int i = count; i > pos; i--) {
            items[i] = items[i - 1];
        }

        items[pos] = n;
        count++;
    }

    public boolean isEmpty() {
        return count == 0;
    }

}
