package comp258.practice.labs.lab01;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Laken
 */
public class ArrayPractice {
    
//        ArrayManagerInClass am = new ArrayManagerInClass(1);
//
//        try {
//            am.add(6);
//        } catch (ArrayFullException e) {
//            System.out.println("Array is full! " + e);
//        }
//
//        try {
//            am.add(7);
//        } catch (ArrayFullException e) {
//            System.out.println("Array is full! " + e);
//        }
//        am.print();
//        ArrayPractice ap = new ArrayPractice();
//        ap.Part1();
    

    public void Part1() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(7);
        numbers.add(25);
        numbers.add(4);
        numbers.add(18);

        System.out.println("ArrayList: " + numbers);
        // Display the number of items  in the ArrayList. 
        System.out.println("Item count: " + numbers.size());

        // Use a loop to display all of the items. 
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(i + ": " + numbers.get(i) + ", ");
        }

        // Add the value 30 to the end of the list. 
        numbers.add(2, 15);

        // Insert the value 15 at index 2. 
        numbers.add(30);

        // Remove the item at index 4.
        numbers.remove(4);

        // Display the item stored at index 3. 
        System.out.println("Item [3]: " + numbers.get(3));

        // Change the item at index 0 to 100. 
        numbers.set(0, 100);

        // Change the item at index 0 to 100. 
        System.out.println("ArrayList: " + numbers);

        ArrayList<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Jane");
        System.out.println(names);
    }

}
