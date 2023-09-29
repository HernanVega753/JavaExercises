/*
 Programa que lea una serie de números por teclado hasta que se lea un número 
negativo. El programa indicará cuántos números acabados en 2 (positivo) se han
leído.
 */
package exercises;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        int num, contador = 0;
        Scanner entrada = new Scanner(System.in);
        // Utilizo do while porque ahorro unas líneas en comparación de ingresar
        // el primer valor fuera del ciclo.
        do {
            System.out.println("Ingrese un número: ");
            num = Integer.parseInt(entrada.nextLine());
            // Identifico los números terminados en 2 dividiendo por 10 y
            // analizando el resto (ej. 12%10 = 2)
            if (num%10 == 2){
                contador ++;
            }
        }while (num > 0);
        System.out.println("La cantidad de números terminados en 2 ingresados"
                + " es de: " + contador);
    }
}
