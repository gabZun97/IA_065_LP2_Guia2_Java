/*
La política de cobro de una compañía telefónica es:
Cuando se realiza una llamada, el cobro es por el tiempo que esta dura, de tal forma que los
primeros cinco minutos cuestan 2 dólares, los siguientes tres, 60 céntimos, los siguientes dos
minutos a 40 céntimos y a partir del décimo minuto, 30 céntimos.
Además, se carga un impuesto de 2% cuando es domingo, y si es otro día, en turno de mañana
18% y en turno de tarde 12%.
Realiza un programa para determinar cuánto debe pagar por cada concepto una persona que realiza
una llamada.
 */
package Grupo_Numero_3;

import java.io.IOException;
import java.util.Scanner;
public class E9_FAMC {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int dia, jornada = 0;
        double Cjornada = 0.0;
        double Tmañana = 0.18, Ttarde = 0.12, costo = 2.0;
        double tiempo = 0, impuesto = 0.02, subTotal = 0.0, total = 0.0;
        int caso = 0;
        char seguir = 's';

        System.out.println("------------------------------------------------");
        System.out.println(" Bienvenidos a Hondutel ");
        System.out.println("------------------------------------------------");

        do {
            System.out.println(" Que dia realizo la llamada 1-7 ?\n1. Lunes\n2. Martes\n3. Miercoles\n4. Jueves\n5.Viernes\n6. Sabado\n7. Domingo ");
            dia = in.nextInt();
            switch (dia) {
                case 1:
                    System.out.println(" En que jornada hizo la llamada ?\n1. Por la mañana\n2. Por la tarde ");
                    jornada = in.nextInt();
                    System.out.println(" Cuanto tiempo duro la llamada en minutos ? ");
                    tiempo = in.nextDouble();
                    if (tiempo <= 5 ) {
                        subTotal =  costo;
                    } else if (tiempo > 5 && tiempo <=8 ) {
                        subTotal = costo + 0.60;
                    } else if (tiempo > 8 && tiempo < 10 ) {
                        subTotal = costo + 0.40;
                    } else if (tiempo >= 10) {
                        subTotal = costo + 0.30;
                    }
                    if (jornada == 1) {
                        Cjornada += Tmañana;
                    } else {
                        Cjornada += Ttarde;
                    }
                    total = subTotal + (subTotal * Cjornada);
                case 2:
                    System.out.println(" En que jornada hizo la llamada ?\n1. Por la mañana\n2. Por la tarde ");
                    jornada = in.nextInt();
                    System.out.println(" Cuanto tiempo duro la llamada en minutos ? ");
                    tiempo = in.nextDouble();
                    if (tiempo <= 5 ) {
                        subTotal =  costo;
                    }else if (tiempo > 5 && tiempo <=8 ) {
                        subTotal = costo + 0.60;
                    }else if (tiempo > 8 && tiempo < 10 ) {
                        subTotal = costo + 0.40;
                    }else if (tiempo >= 10) {
                        subTotal = costo + 0.30;
                    }
                    if (jornada == 1) {
                        Cjornada += Tmañana;
                    } else {
                        Cjornada +=  Ttarde;
                    }
                    total = subTotal + (subTotal * Cjornada);

                    break;
                case 3:
                    System.out.println(" En que jornada hizo la llamada ?\n1. Por la mañana\n2. Por la tarde ");
                    jornada = in.nextInt();
                    System.out.println(" Cuanto tiempo duro la llamada en minutos ? ");
                    tiempo = in.nextDouble();

                    if (tiempo <= 5 ) {
                        subTotal =  costo;
                    } else if (tiempo > 5 && tiempo <=8 ) {
                        subTotal = costo + 0.60;
                    } else if (tiempo > 8 && tiempo < 10 ) {
                        subTotal = costo + 0.40;
                    } else if (tiempo >= 10) {
                        subTotal = costo + 0.30;
                    }
                    if (jornada == 1) {
                        Cjornada += Tmañana;
                    } else {
                        Cjornada +=  Ttarde;
                    }
                    total = subTotal + (subTotal * Cjornada);
                    break;
                case 4:
                    System.out.println(" En que jornada hizo la llamada ?\n1. Por la mañana\n2. Por la tarde ");
                    jornada = in.nextInt();
                    System.out.println(" Cuanto tiempo duro la llamada en minutos ? ");
                    tiempo = in.nextDouble();

                    if (tiempo <= 5 ) {
                        subTotal =  costo;
                    } else if (tiempo > 5 && tiempo <=8 ) {
                        subTotal = costo + 0.60;
                    } else if (tiempo > 8 && tiempo < 10 ) {
                        subTotal = costo + 0.40;
                    } else if (tiempo >= 10) {
                        subTotal = costo + 0.30;
                    }
                    if (jornada == 1) {
                        Cjornada += Tmañana;
                    } else {
                        Cjornada +=  Ttarde;
                    }
                    total = subTotal + (subTotal * Cjornada);
                    break;
                case 5:
                    System.out.println(" En que jornada hizo la llamada ?\n1. Por la mañana\n2. Por la tarde ");
                    jornada = in.nextInt();
                    System.out.println(" Cuanto tiempo duro la llamada en minutos ? ");
                    tiempo = in.nextDouble();

                    if (tiempo <= 5 ) {
                        subTotal =  costo;
                    } else if (tiempo > 5 && tiempo <=8 ) {
                        subTotal = costo + 0.60;
                    } else if (tiempo > 8 && tiempo < 10 ) {
                        subTotal = costo + 0.40;
                    } else if (tiempo >= 10) {
                        subTotal = costo + 0.30;
                    }
                    if (jornada == 1) {
                        Cjornada += Tmañana;
                    } else {
                        Cjornada +=  Ttarde;
                    }
                    total = subTotal + (subTotal * Cjornada);
                    break;
                case 6:
                    System.out.println(" En que jornada hizo la llamada ?\n1. Por la mañana\n2. Por la tarde ");
                    jornada = in.nextInt();
                    System.out.println(" Cuanto tiempo duro la llamada en minutos ? ");
                    tiempo = in.nextDouble();

                    if (tiempo <= 5 ) {
                        subTotal =  costo;
                    } else if (tiempo > 5 && tiempo <=8 ) {
                        subTotal = costo + 0.60;
                    }else if (tiempo > 8 && tiempo < 10 ) {
                        subTotal = costo + 0.40;
                    } else if (tiempo >= 10) {
                        subTotal = costo + 0.30;
                    }
                    if (jornada == 1) {
                        Cjornada += Tmañana;
                    } else {
                        Cjornada +=  Ttarde;
                    }
                    total = subTotal + (subTotal * Cjornada);
                    break;
                case 7:
                    System.out.println(" En que jornada hizo la llamada ?\n1. Por la mañana\n2. Por la tarde ");
                    jornada = in.nextInt();
                    System.out.println(" Cuanto tiempo duro la llamada en minutos ? ");
                    tiempo = in.nextDouble();

                    if (tiempo <= 5 ) {
                        subTotal =  costo;
                    } else if (tiempo > 5 && tiempo <=8 ) {
                        subTotal = costo + 0.60;
                    } else if (tiempo > 8 && tiempo < 10 ) {
                        subTotal = costo + 0.40;
                    } else if (tiempo >= 10) {
                        subTotal = costo + 0.30;
                    }
                    if (jornada == 1) {
                        Cjornada += Tmañana;
                    } else {
                        Cjornada +=  Ttarde;
                    }
                    total = subTotal + (subTotal * Cjornada * impuesto);
                    break;
                default:
                    System.out.println("Dia no establecido.");
                    break;
            }
            System.out.println(" El dia que realizo la llamada es: " + dia);
            System.out.println(" La llamada duro: " + tiempo + " minutos");
            System.out.println(" La jornada fue : " + jornada );
            System.out.println(" El costo sin impiesto es : " + subTotal);
            System.out.println(" El total a pagar es: "+ total);

            System.out.println("Desea realizar otra llamada ? s=si / n=no : ");
            seguir = (char)System.in.read();

        } while(seguir == 's');
    }
}
