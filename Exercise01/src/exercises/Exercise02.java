/*
 Counting the digits of an integer in Java
Java program that prompts for an integer input and calculates and displays the number of digits it has.
 */
package exercises;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner entry = new Scanner(System.in);
        int counter = 0;
        int num = Integer.parseInt(entry.nextLine());
        while (num != 0) {
            num /= 10;  // Extract a digit at time dividing on 10
            counter ++;
        }
        System.out.println("Digits of the number: "+ counter);
    }
}
