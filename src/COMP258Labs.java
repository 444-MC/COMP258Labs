
import java.util.ArrayList;

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
    public static void main(String[] args) {
        System.out.println("Welcome to COMP 258");
        System.out.println("Lab 1: Array-based data structures");
        //        RandomNumberProgram rp = new RandomNumberProgram();
//        rp.run();

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
        DriverOfArrayManager driveOfArray = new DriverOfArrayManager();
        driveOfArray.run();

    }
}
