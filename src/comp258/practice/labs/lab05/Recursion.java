/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comp258.practice.labs.lab05;

/**
 *
 * @author Laken
 */
public class Recursion {

    public static boolean isPalindrome(String s, int left, int right) {
        System.out.println("start:" + "__" + left + "__" + right);
        if (left >= right) {
            System.out.println(left + "___ " + right);
            return true;
        }

        if (s.charAt(left) != s.charAt(right)) {
            System.out.println(s.charAt(left) + "@@ " + s.charAt(right));
            return false;
        }

        System.out.println(s + "__" + left + "__" + right);
        return isPalindrome(s, left + 1, right - 1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isPalindrome("level", 0, 4)); // true
//        System.out.println(isPalindrome("oello", 0, 4)); // false
    }

}
