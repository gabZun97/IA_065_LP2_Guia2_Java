/*
Realiza un programa que calcule la potencia de un número, dado este y su exponente. Pueden
ocurrir tres casos:
i. El exponente sea positivo: imprime resultado en pantalla.
ii. El exponente sea 0, el resultado es 1.
iii. El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.
 */
package Grupo_Numero_3;

import java.util.Scanner;
public class E6_MNRC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base;
        int exponente;
        // Solicitud de datos al usuario
        System.out.println("----------Calculamos la potencia de un número------------:");
        System.out.print("Introduce la base de la potencia: ");
        base = scanner.nextInt();
        System.out.print("Introduce el exponente de la potencia: ");
        exponente = scanner.nextInt();

        // Realizamos Cálculos y mostramos en pantalla
        if (base >= 1) {
            System.out.println("El resultado es " + (Math.pow(base, exponente)));
        } else if (exponente == 0) {
            System.out.println("El resultado es 1.");
        } else {
            System.out.println("El resultado es " + (Math.pow(base, 1/exponente)));
        }
    }
}
