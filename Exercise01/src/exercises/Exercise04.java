/*
 Mostrar la tabla de multiplicar de un número en Java
Programa Java que lea un número entero N y muestre la tabla de multiplicar de 
ese número. Por ejemplo, si se lee el valor 7 se mostrará por pantalla:
Tabla del 7
--------------
7 * 1  =  7
7 * 2  = 14
7 * 3  = 21
7 * 4  = 28
7 * 5  = 35
7 * 6  = 42
7 * 7  = 49
7 * 8  = 56
7 * 9  = 63
7 * 10 = 70
 */
package exercises;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número de la tabla de multiplicación");
        int numero = Integer.parseInt(entrada.nextLine());
        for (int i = 0; i <= 10; i++){
            // el ciclo for da el formato de tabla en cada iteración
            // ahorro variables haciendo el cálculo directamente en el print.
            System.out.println(numero + "*" + i + "=" + (numero*i) );
        }
    }
}
