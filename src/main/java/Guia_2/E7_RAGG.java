/*
Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros:
edad, nota y sexo.
i. Mínimo: Nota (65 a 100), edad (18 a 40), sexo M -> POSIBLE
ii. Mínimo: Nota (65 a 100), edad (18 a 45), sexo F -> ACEPTADA
iii. Otros casos -> NO ACEPTADA
 */
package Grupo_Numero_3;

import java.util.Scanner;
public class E7_RAGG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nota, edad;
        String sexo;

        System.out.println("Este programa nos calcula la aceptación de una solicitud" + "en base a los siguientes parámetros:");
        System.out.print("-----------> Edad: ");
        edad = in.nextInt();
        System.out.print("-----------> Nota: ");
        nota = in.nextInt(); in.nextLine();
        System.out.print("------> Sexo (M o F): ");
        sexo = in.nextLine();

        if (!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
            System.out.println("El valor de sexo introducido es incorrecto.\n"+ "por favor, reenviar el formulario.");
        } else if ((nota >= 65) && (edad > 18) && (sexo.toUpperCase().equals("M"))) {
            System.out.println("POSIBLE");
        } else if (nota >= 65 && edad > 18 && sexo.toUpperCase().equals("F")) {
            System.out.println("ACEPTADA");
        } else {
            System.out.println("NO ACEPTADA");
        }
    }
}
