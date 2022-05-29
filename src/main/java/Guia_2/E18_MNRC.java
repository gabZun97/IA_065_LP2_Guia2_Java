/*
Programa que crea una matriz irregular de enteros. El número de filas se pide por teclado. Para
cada fila se pedirá el número de columnas que tiene. El número mínimo de filas debe ser 2 y el
número mínimo de columnas debe ser 2. A continuación asigna a cada elemento de la matriz un
número aleatorio del 60 al 100. Finalmente muestra por pantalla el contenido de la matriz y la
suma de todos los elementos.
 */
package Grupo_Numero_3;

import java.util.Random;
import java.util.Scanner;
public class E18_MNRC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int filas, columnas;

        do { //Lectura de las filas
            System.out.print("Introduce número de filas: ");
            filas = sc.nextInt();
            if (filas < 2) {
                System.out.println("Valor no válido");
            }
        } while (filas < 2);

        //Se crea el array solo con el número de filas
        //El número de columnas se deja vacío
        //El número de columnas para cada fila lo indicaremos después
        int[][] A = new int[filas][];

        //Para cada fila pedimos el número de columnas que tendrá
        for (int i = 0; i < A.length; i++) {
            do {
                System.out.print("Número de columnas para la fila " + i + ": ");
                columnas = sc.nextInt();
                if (columnas < 1) {
                    System.out.println("Valor no válido");
                }
            } while (columnas < 1);
            //Se crea un array del tamaño indicado y se le asigna a la fila
            A[i] = new int[columnas];
        }

        //A cada elemento de la matriz se le asigna un valor aleatorio del 60 al 100
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = rnd.nextInt(100) + 60;
            }
        }

        //Se muestra el contenido de la matriz
        System.out.println("Contenido del array:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
