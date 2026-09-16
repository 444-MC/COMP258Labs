/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Laken
 */
public class ArrayFullException extends Exception {

    public ArrayFullException() {
        super("Arrary is at full capacity");
    }
    
     public ArrayFullException(String errorMessage) {
        super(errorMessage);
    }
}
