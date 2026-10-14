/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.labs;

import comp258.framework.ConsoleProgram;
import java.util.Scanner;
import comp258.practice.labs.lab03.LinkedList;

/**
 *
 * @author Laken
 * @descroption: this is for lab03
 * @date: Sep 29
 */
public class LinkedListProgram extends ConsoleProgram {

    protected Scanner input = new Scanner(System.in);
    LinkedList list = new LinkedList();

    public void runLinkedListTest() {
        list = new LinkedList();
        list.addAfter(5);
        list.addAfter(6);
        list.addAfter(7);
        list.addAfter(8);
        list.addAfter(9);
        list.addAfter(10);
        list.addAfter(11);
        list.addAfter(12);
        System.out.println("Test list created:");
        list.print();
    }

    @Override
    public int showMenu() {
        System.out.println("\n============================");
        System.out.println("            MENU            ");
        System.out.println("============================");
        System.out.println("1. Add Before");
        System.out.println("2. Add After");
        System.out.println("3. Print");
        System.out.println("4. Get Current");
        System.out.println("5. Get Item At");
        System.out.println("6. Delete Current");
        System.out.println("7. Advance");
        System.out.println("8. Start");
        System.out.println("9. Run Test");
        System.out.println("0. Return to Main Menu");
        
        return readInt("Enter your choice: ");
    }

    @Override
    public void executeAction(int choice) {
        switch (choice) {
            case 1:
                int valBefore = readInt("Enter value to add before: ");
                list.addBefore(valBefore);
                break;
            case 2:
                int valAfter = readInt("Enter value to add after: ");
                list.addAfter(valAfter);
                break;
            case 3:
                list.print();
                break;
            case 4:
                System.out.println("Current: " + list.getCurrent());
                break;
            case 5:
                int index = readInt("Enter index: ");
                System.out.println("Item at index " + index + ": " + list.getItemAt(index));
                break;
            case 6:
                list.deleteCurrent();
                System.out.println("Deleted current item.");
                break;
            case 7:
                boolean advanced = list.advance();
                System.out.println("Advanced: " + advanced);
                break;
            case 8:
                list.start();
                System.out.println("Moved parser to start.");
                break;
            case 9:
                runLinkedListTest();
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }

}
