/*
Construya un programa que haga las siguientes operaciones recibiendo como entrada 2 pares de
números enteros:
i. Multiplicación
ii. División
iii. Modulo
iv. Adición
v. Resta
 */
package Grupo_Numero_3;
import java.util.Scanner;
public class E1_KGZB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y;
        System.out.println("Operaciones a realizar.\n");
        System.out.println("1.Multiplicación. \n2.División. \n3.Módulo. \n4.Adición \n5.Resta.\n");
        System.out.print("Ingrese el primer valor entero: ");
        x = in.nextInt();
        System.out.print("Ingrese el segundo valor entero: ");
        y = in.nextInt();

        System.out.println("\n1.La multiplicación de los valores es: " + (x * y));
        System.out.println("2.La división de los valores es: " + (x / y));
        System.out.println("3.El Residuo o modulo de dividir " + x + "/" + y + " es: " + (x % y));
        System.out.println("4.La adición de los valores es:" + (x + y));
        System.out.println("5.La resta de los valores es: " + (x - y));
    }
}
