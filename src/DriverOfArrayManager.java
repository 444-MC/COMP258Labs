
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Laken
 */
public class DriverOfArrayManager extends ConsoleProgram {

    // Begin by creating an ArrayManager containing 9 integers. 
    private final int[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8};
    ArrayManager items = new ArrayManager(values);

//    ArrayManager items = new ArrayManager(9);
    protected Scanner input = new Scanner(System.in);

    @Override
    public int showMenu() {
        System.out.println("1. Display number of items ");
        System.out.println("2. Display all items");
        System.out.println("3. Add an item");
        System.out.println("4. Add an item at a position ");
        System.out.println("5. Remove an item");
        System.out.println("0. Exit");

        return readInt("Select an option: ");
    }

    @Override
    public void executeAction(int choice) {

        switch (choice) {
            case 1:
                System.out.println("Number of items: " + items.size());
                break;
            case 2:
                items.print();
                break;
            case 3:
                addAnItem();
                break;
            case 4:
                addAnItemIndex();
                break;
            case 5:
                removeAnItem();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public void addAnItem() {
        int value = readInt("Enter a number to add: ");
        items.add(value);
    }

    public void addAnItemIndex() {
        int index = readInt("Enter an index to add: ");
        int value = readInt("Enter a number to add: ");

        try {
            items.addAt(value, index);
            System.out.println("Item added successfully.");
        } catch (OutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds!");

        }

    }

    public void removeAnItem() {
        int index = readInt("Enter an index to remove: ");

        try {
            items.remove(index);
            System.out.println("Item removed successfully.");
        } catch (NoItemsException e) {
            System.out.println("Error: Index is out of bounds!");
        }

    }

}
