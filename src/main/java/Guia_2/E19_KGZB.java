/*
Dada una matriz X almacenar en un vector A la suma por sus columnas y en un vector B la suma
por sus filas.
 */
package Grupo_Numero_3;

import java.util.Scanner;
public class E19_KGZB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int matriz [][] = new int [2][4];
        int sumafila [] = new int [2];
        int sumacolumna [] = new int [4];
        int i, j, suma = 0;

        System.out.println("Ingresando valores de la Matriz.");

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print("Posición matriz: ["+i+"] ["+j+"]: ");
                matriz[i][j]= in.nextInt();
            }
        }
        System.out.println("\nLa matriz ingresada es de 2x4, los valores son los siguientes: ");

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

        for (i = 0; i < 2; i++) {
            suma = 0;
            for (j = 0; j < 4; j++) {
                suma = suma + matriz[i][j];
            }
            sumafila[i] = suma;
        }

        for (j = 0; j < 4; j++) {
            suma = 0;
            for (i = 0; i < 2; i++) {
                suma = suma + matriz[i][j];
            }
            sumacolumna[j] = suma;
        }

        System.out.println("\nSumatoria de las filas.");
        for (i = 0; i < 2; i++) {
            System.out.println("Posición fila: ["+i+"]: " + sumafila[i]);
        }

        System.out.println("\nSumatoria de columnas.");
        for (j = 0; j < 4; j++) {
            System.out.println("Posición columna: [" + j + "]: " + sumacolumna[j]);
        }
    }
}

