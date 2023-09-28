/*
 SWAPPING VALUES BETWEEN TWO VARIABLES USING AN AUXILIARY VARIABLE
 */
package exercise01;

public class Exercise01 {
    public static void main(String[] args) {
        int number = 20, numberAux, number2 = 10;
        numberAux = number;  // pass the value of number to numberAux
        number = number2;  // pass the value of number2 to number
        number2 = numberAux; // the last step is pass the value of numberAux to number2
        
        System.out.println("the new value of number is " + number + "\n the new value of number2 is " + number2);
    }
}
