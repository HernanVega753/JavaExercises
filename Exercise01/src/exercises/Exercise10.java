/*
3. Programa que lee por teclado la nota de los alumnos de una clase y calcula la
nota media del grupo. También muestra los alumnos con notas superiores a la 
media. El número de alumnos se lee por teclado.
 */
package exercises;

import java.util.Random;
import javax.swing.JOptionPane;

public class Exercise10 {
    public static void main(String[] args) {
        Random random = new Random();
        int numero_de_alumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de Alumnos"));
        int[] notas_de_alumnos = new int[numero_de_alumnos];
        int suma_notas = 0;
        float promedio_de_alumnos = 0;
        int alumnos_encima_del_promedio = 0;
        // Relleno el array con números aleatorios
        for (int i = 0; i < numero_de_alumnos;i++){
            notas_de_alumnos[i] = random.nextInt(10)+1;
            suma_notas += notas_de_alumnos[i];
            // Imprimo para controlar el resultado del programa (En consola)
            System.out.println("Alumno "+(i+1)+" nota: "+notas_de_alumnos[i]);
        }
        // Saco promedio de las notas en una variable
        promedio_de_alumnos = suma_notas / numero_de_alumnos;
        System.out.println("promedio_de_alumnos = " + promedio_de_alumnos);
        // Uso la variable para encontrar los que están por encima de la media
        for (int j = 0; j < numero_de_alumnos; j++){
            if (notas_de_alumnos[j] > promedio_de_alumnos){
                alumnos_encima_del_promedio++;
            }
        }
        // Imprimo en JOptionPane
        JOptionPane.showMessageDialog(null, "La nota promedio de los alumnos"
                + " es: "+promedio_de_alumnos+"\n El número de alumnos destacados"
                        + " es de: "+alumnos_encima_del_promedio);
    }
}
