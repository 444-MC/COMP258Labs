/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.labs;

import comp258.collections.GenericList;
import comp258.framework.ConsoleProgram;
import comp258.practice.labs.lab05.RecursiveFunctionsApp;
import java.util.Scanner;

/**
 *
 * @author Laken
 */
public class RecursiveFunctionsProgram extends ConsoleProgram {

    private final RecursiveFunctionsApp recursiveApp
            = new RecursiveFunctionsApp();

    private final GenericList<Integer> list = new GenericList<>();

    public RecursiveFunctionsProgram() {
        list.addAfter(10);
        list.addAfter(20);
        list.addAfter(30);
        list.addAfter(40);
    }

    @Override
    public int showMenu() {
        System.out.println("""
                =========================================
                     Recursive Functions App
                =========================================
                 1  Calculate factorial
                 2  Calculate powers
                 3  Check if a word is a palindrome
                 4  Print number's digit sum
                 5  Run Indent-o-tron
                 6  Print linked list with recursion
                 7  Print linked list backwards with recursion
                 0  Exit program
                =========================================
                """);

        return readInt("Choose an option: ");
    }

    @Override
    public void executeAction(int choice) {
        switch (choice) {
            case 1 -> {
                int n = readInt("Enter a non-negative integer: ");
                if (n < 0 || n > 12) {
                    System.out.println("Please enter a number from 0 to 12.");
                } else {
                    System.out.println(
                            n + "! = " + recursiveApp.factorial(n));
                }
            }

            case 2 -> {
                int base = readInt("Enter the base: ");
                int exponent = readInt("Enter a non-negative exponent: ");

                if (exponent < 0 || exponent > 30) {
                    System.out.println(
                            "Please enter an exponent from 0 to 30.");
                } else {
                    System.out.println(
                            base + "^" + exponent + " = "
                            + recursiveApp.calculatePower(base, exponent));
                }
            }

            case 3 -> {
                System.out.print("Enter a word: ");
                String word = input.nextLine();
                if (recursiveApp.isPalindrome(word)) {
                    System.out.println(word + " is a palindrome.");
                } else {
                    System.out.println(word + " is not a palindrome.");
                }
            }

            case 4 -> {
                int number = readInt("Enter an integer: ");
                System.out.println(
                        "Digit sum = " + recursiveApp.digitSum(number));
            }

            case 5 -> {
                int max = readInt("Enter the maximum call number: ");
                if (max < 1 || max > 100) {
                    System.out.println("Please enter a number from 1 to 100.");
                } else {
                    recursiveApp.indentoTron(max);
                }
            }

            case 6 -> {
                System.out.println("Printing linked list:");
                list.printList();
            }

            case 7 -> {
                System.out.println("Printing linked list backwards:");
                list.printBackwards();
                System.out.println();
            }

            default ->
                System.out.println("Invalid choice. Please select 1-8.");
        }
    }
}
