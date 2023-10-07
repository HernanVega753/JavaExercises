/*
Programa Java que pida por teclado la nota obtenida por cada alumno en un examen 
y calcule y muestre la nota media de la clase, la nota mayor y la nota menor.  
 */
package exercises;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        // Necesito la cantidad de alumnos
        System.out.println("Ingrese la cantidad de alumnos: ");
        int cantidad_alumnos = Integer.parseInt(entrada.nextLine());
        // Las variables que voy a usar inicializadas
        float[] notas = new float[cantidad_alumnos];
        float suma_notas = 0;
        float nota_mayor = 0;
        float nota_menor = 10;
        float promedio_notas = 0;
        // Ciclo for para rellenar | if anidado para sacar el número mayor | if anidado para sacar número menor
        for (int i = 0; i < cantidad_alumnos; i++){
            System.out.println("Ingrese nota N°"+(i+1));
            notas[i] = Float.parseFloat(entrada.nextLine());
            suma_notas += notas[i];  // Suma de los elementos que se vayan ingresando para sacar promedio
            if (nota_mayor < notas[i]){
                nota_mayor = notas[i];
            }
            if (nota_menor > notas[i]){
                nota_menor = notas[i];
            }
            promedio_notas = suma_notas / cantidad_alumnos;  // formula del promedio
        }
        System.out.println("El promedio del curso es "+promedio_notas+" La nota más alta es "+nota_mayor+" y la nota más baja es "+nota_menor);
    }
}
