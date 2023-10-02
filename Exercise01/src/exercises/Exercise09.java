/*
 1. Calcular la media de una serie de números que se leen por teclado.

Programa Java que lea por teclado 10 números enteros y los guarde en un array. 
A continuación calcula y muestra por separado la media de los valores positivos 
y la de los valores negativos.
 */
package exercises;

import java.util.Scanner;

public class Exercise09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numerosPositivos = 0, sumaPositivos = 0;
        int numerosNegativos = 0, sumaNegativos = 0, ceros = 0;
        int[] numeros = new int[10];

        // Lleno el arreglo
        System.out.println("Ingrese los números para trabajar: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = Integer.parseInt(entrada.nextLine());
        }

        // Lo recorro sumando los valores positivos y negativos y sumando las
        // veces que aparecen
        for (int i = 0; i < 10; i++) {
            if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                numerosNegativos += 1;
            } else if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                numerosPositivos += 1;
            } else if (numeros[i] == 0) {
                ceros += 1;
            }
        }
        // Para evitar errores de división por 0 pongo un condicional
        if (numerosNegativos != 0) {
            System.out.println("La media de números negativos es: " + sumaNegativos / numerosNegativos + "\n");
        } else {
            System.out.println("No ha ingresado números negativos");
        }
        if (numerosPositivos != 0) {
            System.out.println("La media de números positivos es: " + sumaPositivos / numerosPositivos + "\n");
        } else {
            System.out.println("No ha ingresado números positivos");
        }
        System.out.println("La cantidad de ceros es: " + ceros + "\n");

    }
}
