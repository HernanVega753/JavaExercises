/*
 Cifrado César en Java
Programa para codificar o decodificar un texto utilizando el método de cifrado 
de César. Supondremos que el texto solo contiene letras mayúsculas o minúsculas. 
La letras serán las correspondientes al alfabeto inglés (26 caracteres, 
excluimos la ñ y Ñ).
En este método de cifrado cada letra del texto se sustituye por otra letra que 
se encuentra N posiciones adelante en el alfabeto. Se considera que el alfabeto 
es circular, es decir, la letra siguiente a la ‘z’ es la ‘a’.
Por ejemplo, si N es 3, la ‘a’ se transformaría en ‘d’, la ‘b’ en ‘e’, la ‘c’ en 
‘f’, etc.
Ejemplo de cifrado César: si el texto es “casa” y N = 3 el texto cifrado es 
“fdvd”
Para descifrar un texto se realiza la operación contraria. Se calcula la letra 
que está N posiciones por detrás en el alfabeto. Como el alfabeto es circular, 
la letra anterior a la ‘a’ es la ‘z’.
El programa pedirá por teclado un texto, a continuación el valor de N y si 
queremos codificar o decodificar el texto. Finalmente se mostrará el texto 
resultante.
 */
package exercises;

import java.util.Scanner;

public class Exercise07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cadena");
        String cadena = entrada.nextLine();
        System.out.println("Ingrese N cifrado Cesar");
        int cesar = Integer.parseInt(entrada.nextLine());
        System.out.println("Presione \"C\" si quiere cifrar un mensaje, y "
                + "presione \"D\" si quiere descifrarlo: ");
        String opcion = entrada.nextLine();

        if (opcion.startsWith("C")) {
            cadenaCifrada(cadena, cesar);
        } else if (opcion.startsWith("D")) {
            cadenaDecifrada(cadena, cesar);
        } else {
            System.out.println("Opción fuera del rango, revise minúsculas y"
                    + " mayúsculas");
        }
    }

    public static void cadenaCifrada(String cadenaSinCifrar, int numeroCesar) {
        String aux1 = "";
        for (int i = 0; i < cadenaSinCifrar.length(); i++) {
            char aux = cadenaSinCifrar.charAt(i);
            aux += numeroCesar;  // Esta parte corre el caracter N espacios.
            aux1 += aux;
        }
        System.out.println(aux1);
    }

    public static void cadenaDecifrada(String cadenaSinCifrar, int numeroCesar) {
        String aux1 = "";
        for (int i = 0; i < cadenaSinCifrar.length(); i++) {
            char aux = cadenaSinCifrar.charAt(i);
            aux -= numeroCesar;  // Esta parte corre el caracter N espacios.
            aux1 += aux;
        }
        System.out.println(aux1);
    }
}
        