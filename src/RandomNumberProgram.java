/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Laken
 */
public class RandomNumberProgram extends ConsoleProgram {
    private int[] numbers = new int[20];

    @Override
    public int showMenu() {
        System.out.println("1. Print Numbers");
        System.out.println("2. Search");
        System.out.println("3. Find and Replace");
        System.out.println("0. Quit");

        return readInt("Select an option: ");
    }

    @Override
    protected void startProgram() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10) + 1;
        }
    }

    @Override
    public void executeAction(int choice) {
        switch (choice) {
            case 1:
                printNumbers();
                break;

            case 2:
                searchNumbers();
                break;

            case 3:
                findAndReplace();
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }

    /**
     * Display all values currently stored in the array.
     */
    private void printNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println((i + 1) + ": " + numbers[i]);
        }
    }

    /**
     * Ask the user to enter a number to search for.
     */
    private void searchNumbers() {
        int value = readInt("Enter a number to search for: ");

        int index = findNumber(numbers, value);

        if (index == -1) {
            System.out.println("Number not found.");
        } else {
            System.out.println(
                    value + " was first found at position " + (index + 1)
            );
        }
    }

    /**
     * Ask the user for a value to find and a replacement value
     */
    private void findAndReplace() {
        int value = readInt("Enter the value to find: ");
        int replacement = readInt("Enter the replacement value: ");

        int index = findNumber(numbers, value);

        if (index == -1) {
            System.out.println("Value not found.");
        } else {
            numbers[index] = replacement;

            System.out.println(
                    value + " was replaced at position " + (index + 1) + "."
            );
        }
    }

}
