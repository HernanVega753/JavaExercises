/*

Número capicúa en Java
COMPROBAR SI UN NÚMERO ES CAPICÚA EN JAVA
Un número es capicúa si se puede leer igual de derecha a izquierda que de 
izquierda a derecha. Ejemplos de números capicúas: 121, 3003, 1234321, 33, 
445544, etc.
Vamos a escribir un programa Java que pida por teclado un número entero N de más 
de una cifra y verifique si es capicúa.
 */
package exercises;

import javax.swing.JOptionPane;

public class Exercise08 {
    public static void main(String[] args) {
        String inverso = "";
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número: "));
        String numString = num + "";
        for (int i = numString.length() - 1; i >= 0; i--) {
            inverso += numString.charAt(i); // Agrego el caracter para dejarlo inverso
        }
        
        int numInverso = Integer.parseInt(inverso); // Lo transformo en entero 
        // para que la comparación sea más sencilla
        
        if (num == numInverso){
            JOptionPane.showMessageDialog(null, "El número es CAPICÚA");
        } else {
            JOptionPane.showMessageDialog(null, "El número no es CAPICÚA");
        }
    }
}

