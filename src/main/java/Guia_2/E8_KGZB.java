/*
El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto debe
cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de
cobrar es la siguiente:
i. Si son 100 alumnos o más, el costo por cada alumno es de 65 dólares.
ii. De 50 a 99 alumnos, el costo es de 70 dólares.
iii. De 30 a 49 alumnos, el costo es de 95 dólares.
iv. Menos de 30 alumnos, el costo de la renta del autobús es de 4000 dólares, sin importar el
número de alumnos.
Realiza un programa que permita determinar el pago a la compañía de autobuses y lo que
debe pagar cada alumno por el viaje
 */
package Grupo_Numero_3;

import java.util.Scanner;
public class E8_KGZB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int alumnos = 0, costo = 0;
        System.out.print("Ingrese la cantidad de alumnos a viajar:");
        alumnos = in.nextInt();

        if (alumnos >= 100){
            costo = alumnos * 65;
            System.out.println("El pago que se debe efectuar a la compañía es de: $" + costo + ".");
            System.out.println("El pago por cada alumno es de: $65");
        } else if (alumnos >= 50 && alumnos <= 99){
            costo = alumnos * 70;
            System.out.println("El pago que se debe efectuar a la compañía es de: $" + costo + ".");
            System.out.println("El pago por cada alumno es de: $70");
        } else if (alumnos >= 30 && alumnos <= 49){
            costo = alumnos * 95;
            System.out.println("El pago que se debe efectuar a la compañía es de: $" + costo + ".");
            System.out.println("El pago por cada alumno es de: $95");
        }else if (alumnos < 30 ){
            costo = 4000;
            System.out.println("El pago que se debe efectuar a la compañía por la renta del autobús es de: $" + costo + ".");
        }
    }
}
