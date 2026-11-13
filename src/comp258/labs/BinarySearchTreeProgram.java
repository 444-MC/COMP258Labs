/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.labs;

import comp258.framework.ConsoleProgram;
import comp258.practice.labs.lab07.BinarySearchTree;
import java.util.Scanner;

/**
 *
 * @author Laken
 */
public class BinarySearchTreeProgram extends ConsoleProgram {

    private BinarySearchTree<Widget> bst;
    private Scanner scanner;

    public BinarySearchTreeProgram() {
        this.bst = new BinarySearchTree<>();
        this.scanner = new Scanner(System.in);

        bst.add(new Widget("M-Widget", 50));
        bst.add(new Widget("F-Widget", 25));
        bst.add(new Widget("T-Widget", 75));
        bst.add(new Widget("C-Widget", 12));
        bst.add(new Widget("I-Widget", 37));
        bst.add(new Widget("R-Widget", 62));
        bst.add(new Widget("W-Widget", 87));
    }

    @Override
    public int showMenu() {
        System.out.println("\n--- Binary Search Tree Menu ---");
        System.out.println("1. Add item");
        System.out.println("2. Check if item exists");
        System.out.println("3. Print Binary Search Tree Forward (Ascending)");
        System.out.println("4. Print Binary Search Tree Backward (Descending)");
        System.out.println("5. Print smallest item");
        System.out.println("6. Print largest item");
        System.out.println("0. Exit program");
        System.out.print("Enter your choice (0-6): ");

        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    @Override
    public void executeAction(int choice) {
        switch (choice) {
            case 1:
                System.out.print("Enter widget name: ");
                String name = scanner.nextLine();
                System.out.print("Enter widget id/value: ");
                try {
                    int id = Integer.parseInt(scanner.nextLine().trim());
                    bst.add(new Widget(name, id));
                    System.out.println("Item added successfully.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid ID. Please enter a valid number.");
                }
                break;

            case 2:
                System.out.print("Enter widget name to search: ");
                String searchName = scanner.nextLine();
                System.out.print("Enter widget id to search: ");
                try {
                    int searchId = Integer.parseInt(scanner.nextLine().trim());
                    Widget targetWidget = new Widget(searchName, searchId);
                    boolean exists = bst.searchTree(targetWidget);
                    System.out.println("Item exists in BST: " + exists);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid ID.");
                }
                break;

            case 3:
                System.out.println("--- BST Forward (Ascending) ---");
                bst.printTree();
                break;

            case 4:
                System.out.println("--- BST Backward (Descending) ---");
                bst.printDescending();
                break;

            case 5:
                Widget smallest = bst.getSmallest();
                if (smallest != null) {
                    System.out.println("Smallest item: " + smallest);
                } else {
                    System.out.println("Tree is empty.");
                }
                break;

            case 6:
                Widget largest = bst.getLargest();
                if (largest != null) {
                    System.out.println("Largest item: " + largest);
                } else {
                    System.out.println("Tree is empty.");
                }
                break;

            case 0:
                System.out.println("Exiting Binary Search Tree program...");
                break;

            default:
                System.out.println("Invalid option. Please choose between 1 and 7.");
                break;
        }
    }

}
