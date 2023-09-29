/*
Convertir a números romanos en Java
Programa Java para convertir un número entero a números romanos (Sin arreglos).
El programa pide un número entre 1 y 3999 y calcula su equivalente en números 
romanos. Se utiliza un método llamado convertirANumerosRomanos que recibe el 
número N a convertir de tipo int y devuelve un String con el equivalente en 
números romanos. 
 */
package exercises;

import java.util.Scanner;

public class Exercise06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Ingrese un número a transformar a número romano: ");
            num = Integer.parseInt(entrada.nextLine());
            if ((num < 1) || (num > 3999)) {
                System.out.println("El número ingresado no se encuentra en rango");
            }
        } while ((num < 1) || (num > 3999));
        System.out.println("El número" + num + " en números romanos"
                // Pasamos argumento y llamamos a la función
                + " corresponde a: " + convertirRomano(num));  
    }

    /*
    Creamos una función para convertir a números romanos
     */
    public static String convertirRomano(int numero) {
        int i, unidades, decenas, centenas, unidadesMil;
        String romano = "";
        // Individualizamos cada digito del número
        unidadesMil = numero / 1000;
        centenas = numero / 100 % 10;
        decenas = numero / 10 % 10;
        unidades = numero % 10;

        /*
        Unidades de mil, simplemente contamos la cantidad de unidades de mil
        del número ingresado
         */
        /*
        Sigo el orden de los valores para ordenarlos fácilmente de izquierda
        a derecha
         */
        for (i = 0; i < unidadesMil; i++) {
            romano += "M";
        }
        //centenas
        if (centenas == 9) {
            /*
              Si el número llega a 9, el número no corresponde a C(100) ni a D(500)
            por lo que se pone la primera condición especial
             */
            romano += "CM";
        } else if (centenas >= 5) {
            /*
              Si centenas llega a 5 tiene una letra diferente que C (D), por lo que
            se agrega otra condición especial.
             */
            romano += "D";
            /*
            En la situación que centena sea mayor de 5 debemos añadir
                 la letra D al String
             */
            for (i = 6; i <= centenas; i++) {
                /*
                Añadimos la C a la derecha para formar 600, 700 etc...
                 */
                romano += "C";
            }
        } else if (centenas == 4) {
            /*
          Si el número de centenas es 4 también tiene una combinación especial 
          de letras (CD)
             */
            romano += "CD";
        } else {
            for (i = 1; i <= centenas; i++) {
                /*
                     Finalmente, si el número es menor que 4, simplemente se
                     suman las letras C.
                 */
                romano += "C";
            }
        }
        //decenas, hacemos lo mismo que en centenas
        if (decenas == 9) {
            romano = romano + "XC";
        } else if (decenas >= 5) {
            romano += "L";
            for (i = 6; i <= decenas; i++) {
                romano = romano + "X";
            }
        } else if (decenas == 4) {
            romano += "XL";
        } else {
            for (i = 1; i <= decenas; i++) {
                romano += "X";
            }
        }
        //unidades, idem centenas
        if (unidades == 9) {
            romano += "IX";
        } else if (unidades >= 5) {
            romano = romano + "V";
            for (i = 6; i <= unidades; i++) {
                romano += "I";
            }
        } else if (unidades == 4) {
            romano += "IV";
        } else {
            for (i = 1; i <= unidades; i++) {
                romano += "I";
            }
        }
        return romano;  // Retornamos el String con los números romanos
    }
}
