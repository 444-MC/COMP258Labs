/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.programs;

import comp258.framework.ConsoleProgram;
import comp258.labs.ArrayManagerProgram;
import comp258.labs.ComparableWidgetProgram;
import comp258.labs.LinkedListProgram;
import comp258.labs.RandomNumberProgram;

/**
 *
 * @author Laken
 */
public class LabLauncher extends ConsoleProgram {

    private ConsoleProgram currentProgram;

    @Override
    public int showMenu() {
        System.out.printf("""
                =================================
                          COMP 258 Labs
                =================================
                 1  Random Number App
                 2  Array Manager App
                 3  Linked List App
                 4  Generic List App
                 
                 %d  Exit
                =================================
                """, QUIT_OPTION);

        // 调用父类的方法读取用户输入的整数
        return readInt("Choose lab application: ");
    }

    @Override
    public void executeAction(int choice) {

        if (choice == QUIT_OPTION) {
            System.out.println("Exiting Lab Launcher. Goodbye!");
            return;
        }

        currentProgram = switch (choice) {
            case 1 ->
                new RandomNumberProgram();
            case 2 ->
                new ArrayManagerProgram();
            case 3 ->
                new LinkedListProgram();
            case 4 ->
                new ComparableWidgetProgram();
            default ->
                null;
        };

        if (currentProgram != null) {
            currentProgram.run();
        } else {
            System.out.println("Invalid choice. Please select a valid option from the menu.");
        }

    }

}
