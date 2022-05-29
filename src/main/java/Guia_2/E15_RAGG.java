/*
Empleando arreglos, mostrar n productos con sus respectivos precios de compra, precio de venta,
ganancia siendo esta el 300% sobre el precio de compra.
 */
package Grupo_Numero_3;

public class E15_RAGG {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String utiles []={"Pelota", "Zapatilla","Mochila","Polo"};
        double precios[]={35.5,89.60,45.99,25.70};
        System.out.println("Lista de Productos y sus precios");
        for (int u=0;u<utiles.length;u++){
            System.out.println(utiles[u]+" "+ precios[u]*3);
            System.out.println();
        }
    }
}
