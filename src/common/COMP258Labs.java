package common;

import drivers.DriverOfArrayManager;
import drivers.RandomNumberProgram;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Laken
 */
public class COMP258Labs {

    /**
     * @param args the command line arguments
     */
    public void start() {
        String[] options = {
            "Lab 1: Array-Based Data Structures",
            "Lab 2: Random Number Program"
        };
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to COMP 258");
        System.out.println();

        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }

        System.out.print("Please choose a lab: ");

        int choice = scanner.nextInt();

        handleMenuChoice(choice);
    }

    protected void handleMenuChoice(int choice) {
        switch (choice) {

            case 1 -> {
                System.out.println("\n--- Running Lab 1 ---");
                RandomNumberProgram rp = new RandomNumberProgram();
                rp.run();
            }

            case 2 -> {
                System.out.println("\n--- Running Lab 2 ---");
                DriverOfArrayManager driveOfArray = new DriverOfArrayManager();
                driveOfArray.run();
            }
            case 3 -> {
                System.out.println("\n--- Running Lab 3 ---");
            }
            default ->
                System.out.println("Invalid option.");
        }
    }

    public static void main(String[] args) {
        COMP258Labs labs = new COMP258Labs();
        labs.start();
    }
}
