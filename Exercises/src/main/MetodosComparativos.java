/*
Comprobar si dos String son iguales en Java

Programa java para comprobar si dos String son iguales.

El programa pide que se introduzcan por teclado el contenido de los dos String 
y determina si ambos iguales o no lo son.

Para comprobar si dos String son iguales no podemos compararlos mediante el 
operador == Hay que utilizar el método equals o el método equalsIgnoreCase.
 */
package main;

import java.util.Scanner;

public class MetodosComparativos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una cadena");
        String sentencia1 = entrada.nextLine();
        System.out.println("Ingrese una segunda cadena");
        String sentencia2 = entrada.nextLine();
        // Comparamos String
        if (sentencia1.equals(sentencia2)){
            System.out.println("Las sentencias son exactamente iguales");
        // Ahora comparamos si el contenido es igual (obviando minúsculas y mayúsculas)
        } else if (sentencia1.equalsIgnoreCase(sentencia2)){
            System.out.println("Los elementos no son exáctamente iguales");
        } else {
            System.out.println("Las declaraciones son diferencites");
        }
    }
}
