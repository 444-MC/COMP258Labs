/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labs.lab03;

import java.util.LinkedList;

/**
 *
 * @author Laken
 * @date Sep 29
 */
public class BuiltInLinkedListDemo {

    public void runPart1() {
        System.out.println("Hello, world!");

        LinkedList<Integer> list = new LinkedList<>();

        list.add(12);
        list.add(7);
        list.add(25);
        list.add(4);
        list.add(18);
//Display the number of items

        System.out.println(list.size());
//Display all items
        System.out.println(list);

//Add item 30 to the end
        list.add(30);
        System.out.println(list);
//Add item 15 at position 2
        list.add(2, 15);
        System.out.println(list);
//Remove item at position 4
        list.remove(4);
        System.out.println(list);
//Get item at index 4
        System.out.println(list.get(4));
//Replace item at position 4
        list.set(4, 18);
        System.out.println(list);
//Add to front
        list.addFirst(100);
        System.out.println(list);
//Add to end
        list.addLast(200);
        System.out.println(list);
//Remove first
        list.removeFirst();
        System.out.println(list);
//Remove last
        list.removeLast();
        System.out.println(list);
        System.out.println(list.size());
// Use an enhanced for loop when displaying the built-in list. 
        for (Integer item : list) {
            System.out.print(item + ",");
        }

    }
}
