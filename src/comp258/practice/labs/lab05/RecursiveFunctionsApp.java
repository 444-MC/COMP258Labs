/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.practice.labs.lab05;

/**
 *
 * @author Laken
 */
public class RecursiveFunctionsApp {

    public int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public int calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * calculatePower(base, exponent - 1);
    }

    public boolean isPalindrome(String word) {
        if (word == null) {
            return false;
        }

        word = word.toLowerCase();
        return isPalindrome(word, 0, word.length() - 1);
    }

    public boolean isPalindrome(String word, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }
        return isPalindrome(word, start + 1, end - 1);
    }

    public int digitSum(int number) {
        if (number < 0) {
            number = -number;
        }
        if (number == 0) {
            return 0;
        }
        return (number % 10) + digitSum(number / 10);
    }

    public void indentoTron(int maxNum) {
        indentoTron(1, maxNum);
    }

    private void indentoTron(int currentNum, int maxNum) {
        if (currentNum > maxNum) {
            return;
        }
        System.out.println("This was written by call number " + currentNum + ".");
        indentoTron(currentNum + 1, maxNum);
        System.out.println("This ALSO written by call number " + currentNum + ".");
    }
}
