/*
Crear un arreglo, que nos pida ingresar una palabra, para mostrarlo letra por letra y la suma de sus
caracteres.
 */
package Grupo_Numero_3;

import java.util.Scanner;
public class E16_FAMC {
    public int contarLetras(String frase) {
        char letras [] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

        int numeroLetras = 0;

        String fraseMinusculas = frase.toLowerCase();

        for (int i = 0; i<frase.length(); i++) {
            char letra = frase.charAt(i);
            if (letra != ' ') {
                for (int j = 0; j < letras.length; j++) {
                    if (letra == letras[j]) {
                        numeroLetras++;
                        break;
                    }
                }
            }
        }
        return numeroLetras;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String frase;

        System.out.println(" Favor ingrese una palabra u oración: ");
        frase = in.nextLine();

        E16_FAMC contador = new E16_FAMC();
        System.out.println("Cantidad de letras: -> " + contador.contarLetras(frase));

    }
}
