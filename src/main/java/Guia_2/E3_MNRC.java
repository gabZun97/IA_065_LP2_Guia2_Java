/*
Construya un programa que calcule una línea de factura, para ello, tienes las variables:
i. cantidad (int)
ii. unidades(int)
iii. precio(double)
iv. importe(double)
v. total(int)
Los cálculos que debes realizar son:
• El importe = cantidad multiplicado por las unidades y multiplicado por el precio .
• El total es el resultado de multiplicar el importe por 1.5.
• El valor de IVA es el 21% del importe.
• Debes presentar en salida, también el valor correcto si no convirtiéramos el total a “int”.
 */
package Grupo_Numero_3;

import java.util.Scanner;
public class E3_MNRC {
    public static void main(String[] args) {
        Scanner prod= new Scanner(System.in);
        String Nombre;
        double precio ;
        int cantidad;
        double subtotal;
        double total;
        double total2;
        double impuesto;
        int unidades;
        double IVA=0.21;
        double importe= 1.5;

        System.out.println("Que producto desea comprar?");
        Nombre = prod.next();
        System.out.println("Cual es el precio del producto?"+Nombre+"?");
        precio = prod.nextDouble();
        System.out.println("Cuantas cantidades desea llevar?"+Nombre+"?");
        cantidad = prod.nextInt();
        System.out.println("Cuantas unidades quiere llevar?"+Nombre+"?");
        unidades = prod.nextInt();
        subtotal= precio*cantidad;
        impuesto= subtotal+subtotal*IVA;
        total= subtotal + impuesto;
        if (total>=3000) {
            total2=(total)-total*importe;
            //Imprimiendo pantalla de la factura
            System.out.println("----------FACTURA-------------");
            System.out.println("/nproducto:"+Nombre);
            System.out.println("/nprecio:"+ precio);
            System.out.println("/ncantidad compradas:"+cantidad);
            System.out.println("/nsubtotal:"+subtotal);
            System.out.println("/nimpuesto:"+impuesto);
            System.out.println("/ntotal:"+total);
            System.out.println("/nimporte"+(total*importe));
            System.out.println("/ntotal a pagar"+ total2);

        } else {
            System.out.println("----------FACTURA-------------");
            System.out.println("/nproducto:"+Nombre);
            System.out.println("/nprecio:"+ precio);
            System.out.println("/ncantidad compradas:"+cantidad);
            System.out.println("/nsubtotal:"+subtotal);
            System.out.println("/nimpuesto:"+impuesto);
            System.out.println("/ntotal:"+total);
        }
    }
}
