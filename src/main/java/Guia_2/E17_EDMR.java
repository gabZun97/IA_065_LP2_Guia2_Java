/*
c. Cree un programa que solicite una cadena de texto larga (párrafo de preferencia), posterior en un
arreglo individual, almacene los pronombres personales en primera, segunda, tercera persona,
cuente cada arreglo y exponga la cantidad de pronombres encontrados.
 */
package Grupo_Numero_3;

import java.io.IOException;
import java.util.Scanner;
public class E17_EDMR {
    public static void main(String[] args) throws IOException, IOException {
        Scanner in = new Scanner (System.in);
        int i=0, j=0, k=0;
        String primeraSingular="";
        String segundaPlural="";
        String []cadenaSingular= new String [3]; // El arreglo tipo 3 elementos en singular : primera, segunda, tercera persona.
        String []cadenaPlural = new String [3];
        System.out.println("------------------------Pronombre en singular---------------------------------");
        for ( i = 0; i < cadenaSingular.length; i++) { // Ciclo para guardar los pronombres en singular
            System.out.print("Ingrese los pronombres en "+(i+1)+" persona (Separelos con una coma):");
            cadenaSingular[i] = in.nextLine();
            char [] cadenaPrimera = primeraSingular.toCharArray();//
        }
        System.out.println("\n------------------------Pronombre en plural-----------------------------------");
        for ( j = 0; j < cadenaPlural.length; j++) { // Ciclo para guardar los pronombres en singular
            System.out.print("Ingrese los pronombres en "+(j+1)+" persona (Separelos con una coma):");
            cadenaPlural[j] = in.nextLine(); // Guardamos la cadena de caracteres
            char [] cadenaSegunda = segundaPlural.toCharArray(); // Lo guardado lo convertimos a una cadena
        }

        String formato = "| %-13s | %-25s |%-25s |%n"; // Formato a imprimir
        System.out.format("+---------------+---------------------------+--------------------------+%n");
        System.out.format("|    Persona    |         Singular          |          Plural          |%n");
        System.out.format("+---------------+---------------------------+--------------------------+%n");
        for ( i = 0; i < cadenaPlural.length; i++) {
            for (j = 0; j < cadenaSingular.length; j++) {
                System.out.format(formato,(i+1)+"persona", cadenaSingular[i],cadenaPlural[j]);
            }
        }
        System.out.format("+---------------+---------------------------+--------------------------+%n");
        System.out.println("------------------------Pronombre en singular---------------------------------");
        for (i = 0; i < cadenaSingular.length; i++) {
            String cadena1[] = cadenaSingular[i].split(",");// Para saber cuantos pronombres hay y los cuenta dividiendo en las ,
            for (int l = 0; l < cadena1.length; l++) {
            }
            System.out.println("La cantidad de arreglos encontrados en "+(i+1)+"  persona es de: "+cadena1.length); // Imprime la cantidad de pronombre
        }
        System.out.println("\n------------------------Pronombre en plural-----------------------------------");
        for (j = 0; j < cadenaPlural.length; j++) {
            String cadena2[] = cadenaPlural[j].split(",");// split divide una cadena de caracteres
            for (k = 0; k < cadena2.length; k++) {
            }
            System.out.println("La cantidad de arreglos encontrados en "+(j+1)+"  persona es de: "+cadena2.length);
        }
    }
}
