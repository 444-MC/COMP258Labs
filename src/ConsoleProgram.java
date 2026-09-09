
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Laken
 */
public abstract class ConsoleProgram {

    protected Scanner input = new Scanner(System.in);
    protected static final int QUIT_OPTION = 0;   // constant used for quit

    public final void run() {
        startProgram();
        int choice;
        do {
            choice = showMenu();
            if (choice != QUIT_OPTION) {
                executeAction(choice);
            }
        } while (choice != QUIT_OPTION);
        endProgram();
    }

    // abstract
    public abstract int showMenu();

    // abstract
    public abstract void executeAction(int choice);

    // hook
    protected void startProgram() {
        System.out.println("Program starting...");
    }

    // hook
    protected void endProgram() {
        System.out.println("Program ended.");
    }

    //hook
//    protected int getQuitOption() {
//    }
    // Implement Utility Methods
    protected int readInt(String prompt) {
        System.out.print(prompt);
        while (!input.hasNextInt()) {
            System.out.println("Please enter a whole number.");
            input.nextLine();
            System.out.print(prompt);
        }
        int value = input.nextInt();
        input.nextLine();
        return value;
    }

    // Utility
//    public double readDouble(String pormpt) {
//    }
    // Utility
//    public String readString(String prompt) {
//    }
    protected int findNumber(int[] numbers, int value) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
