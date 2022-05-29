/*
e. Una compañía de transporte internacional tiene servicio en algunos países de América del Norte,
América Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en
el peso del paquete y la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:

ZONA UBICACIÓN         COSTO/KILOGRAMO
1 América del Norte      35 dólares
2 América Central        23 dólares
3 América del Sur        38 dólares
4 Europa                 16 dólares
5 Asia                    5 dólares

Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por
cuestiones de logística y seguridad. Realiza un programa para determinar el cobro por la entrega
de un paquete o, en su caso, el rechazo de la entrega.
 */
package Grupo_Numero_3;

import java.util.Scanner;
public class E10_EDMR {
    public static void main(String[] args) {
        int continuar=0;
        do {
            Scanner in= new Scanner (System.in);
            int opc=0, peso=0, costo=0;
            String lugar="";
            System.out.println("=================================================================");
            System.out.println("             Compañía  de Transporte Internacional               ");
            System.out.println("=================================================================");
            System.out.println("Ofrece servicios de transporte de paquetes: ");
            System.out.println("ZONA UBICACIÓN                COSTO/KILOGRAMO");
            System.out.println("1 América del Norte             35 dólares");
            System.out.println("2 América Central               23 dólares");
            System.out.println("3 América del Sur               38 dólares");
            System.out.println("4 Europa                        16 dólares");
            System.out.println("5 Asia                           5 dólares");
            System.out.println("=================================================================");

            do{
                System.out.print("Ingrese la opción donde desea enviar: ");
                opc = in.nextInt();
            }while(opc<1 && opc>5);// Validamos las 5 opciones de lugares
            switch (opc) {
                case 1:
                    costo=35; // Valor del costo por transportar
                    lugar="América del Norte";// Asignamos el lugar
                    break;
                case 2:
                    costo=23;
                    lugar="América Central";

                    break;
                case 3:
                    costo=38;
                    lugar="América del Sur";
                    break;
                case 4:
                    costo=16;
                    lugar="Europa";
                    break;
                case 5:
                    costo=5;
                    lugar="Asia";
                    break;
                default:
                    System.out.println("Opción no válida!");
            }
            System.out.print("Ingrese el peso del paquete en (kilogramos): ");
            peso = in.nextInt();
            if (peso>5) { // validación paquetes con peso mayor a 5kg no se transportan
                System.out.println("________________________________________________________________");
                System.out.println("Paquetes con un peso superior a 5kg no son transportados.");
                System.out.println("________________________________________________________________");
            }else{
                System.out.println("---------------------------------------------------------");
                System.out.println("El paquete será transportado a "+lugar);
                System.out.println("Su costo es de "+(peso*costo));
                System.out.println("---------------------------------------------------------");
            }
            System.out.println("Desea ingresar otro registro? 1.Si 2. No");
            System.out.print("->");
            continuar = in.nextInt();
        }while (continuar==1);
    }
}
