/*
Pasar de grados centígrados a kelvin en Java
Programa Java que lee una temperatura expresada en grados centígrados y la convierte a grados kelvin. 
El proceso de leer grados centígrados se debe repetir mientras que se responda ‘S’ a la pregunta: Repetir proceso? (S/N)
Para hacer la conversión de grados Centígrados a grados Kelvin hay que utilizar la fórmula:
ºK = ºC + 273
 */
package exercises;

import javax.swing.JOptionPane;

public class Exercise03 {
    public static void main(String[] args) {
        float c = Float.parseFloat(JOptionPane.showInputDialog("Ingrese los grados C°: "));
        float k = 0;
        String opcion = "S";
        while (true) {
            k = c + 273;
            JOptionPane.showMessageDialog(null, c+"°C equivalen a "+k+"°K");
            opcion = JOptionPane.showInputDialog("Repetir proceso? S/N");
            if (opcion.equalsIgnoreCase("N")){  //La forma de comparar String es con equals y equalsIgnoreCase
                // para ignorar si es minúscula o mayúscula.
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Gracias por usar el convertidor");
    }
}
