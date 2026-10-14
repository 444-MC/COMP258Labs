/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.labs;

import comp258.collections.GenericList;
import comp258.framework.ConsoleProgram;

/**
 *
 * @author Laken
 */
public class ComparableWidgetProgram extends ConsoleProgram {

    @Override
    public int showMenu() {
        System.out.println("\n=================================");
        System.out.println("      Generic List & Testing     ");
        System.out.println("=================================");
        System.out.println("1. Test Integer List");
        System.out.println("2. Test String List");
        System.out.println("3. Test Widget List (Full Requirement a-e)");
        System.out.println(QUIT_OPTION + ". Return to Main Menu");
        System.out.println("=================================");

        return readInt("Choose an option: ");
    }

    @Override
    public void executeAction(int choice) {
        switch (choice) {
            case 1 ->
                testIntegerList();
            case 2 ->
                testStringList();
            case 3 ->
                testWidgetList();
            default ->
                System.out.println("Returning to main menu...");
        }
    }

    private void testIntegerList() {
        System.out.println("\n--- Testing GenericList with Integers ---");
        GenericList<Integer> list = new GenericList<>();
        list.addAfter(15);
        list.addAfter(42);
        list.printList();
        System.out.println("Max: " + list.getMaximum());
    }

    private void testStringList() {
        System.out.println("\n--- Testing GenericList with Strings ---");
        GenericList<String> list = new GenericList<>();
        list.addAfter("Apple");
        list.addAfter("Zebra");
        list.printList();
        System.out.println("Max: " + list.getMaximum());
    }

    private void testWidgetList() {
        System.out.println("\n--- Testing Widget List (Full Requirements a-e) ---");
        GenericList<Widget> widgetList = new GenericList<>();

        System.out.println("1. Initial state (Empty list):");
        System.out.println("   b. get max (should be null): " + widgetList.getMaximum());

        Widget w1 = new Widget("Mouse", 25.50);
        Widget w2 = new Widget("Monitor", 299.99);
        Widget w3 = new Widget("Keyboard", 75.99);
        Widget w4 = new Widget("USB Cable", 9.99);

        widgetList.addAfter(w1);
        widgetList.addAfter(w2);
        widgetList.addAfter(w3);
        widgetList.addAfter(w4);

        // a. print list
        System.out.println("\na. print list:");
        widgetList.printList();

        // b. get max & c. get current 
        System.out.println("\nb. get max (finding maximum widget):");
        Widget maxWidget = widgetList.getMaximum();
        System.out.println("   Found Max: " + maxWidget);

        System.out.println("\nc. get current (verifying current is at max):");
        System.out.println("   Current position: " + widgetList.getCurrent());

        // d. advance
        System.out.println("\nd. advance (moving current forward):");
        widgetList.advance();
        System.out.println("   Current position after advance: " + widgetList.getCurrent());

        // e. remove
        System.out.println("\ne. remove (deleting current item):");
        widgetList.remove();
        System.out.print("   List after remove: ");
        widgetList.printList();
    }
}
