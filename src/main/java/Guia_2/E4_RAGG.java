/*
Calcule el perímetro de un triángulo isósceles donde: a es el lado que se repite. b es el lado desigual
o base. Son proporcionados por el usuario. La fórmula: Perímetro = 2a + b
 */
package Grupo_Numero_3;

import java.util.Scanner;
public class E4_RAGG {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int perimetro=0;
        int A=0;
        int B=0;

        System.out.println("************CALCULO DE PERIMETRO DE UN TRIANGULO ISOCELES************");
        System.out.println("------- Ingrese el lado del triangulo:");
        A= in.nextInt();

        System.out.println("-------- Ingrese el lado desigual del triangulo:");
        B= in.nextInt();

        perimetro= (2*A)+B;
        System.out.println("El perimetro es: "+perimetro);
    }
}

