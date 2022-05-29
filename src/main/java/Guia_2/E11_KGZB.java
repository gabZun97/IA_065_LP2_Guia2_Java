/*
Crea una clase con un método main que pida una entrada de teclado y usando un bucle while, el
método length de la clase String y el método substring de la clase String, muestre cada una de las
letras que componen la entrada. Por ejemplo si se introduce “ave” debe mostrar:
i. Letra 1: a
ii. Letra 2: v
iii. Letra 3: e
 */
package Grupo_Numero_3;

import java.util.Scanner;
public class E11_KGZB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A continuación introduzca una palabra que usted desee mostrar: ");
        String palabra = "";
        int i = 0;
        palabra = in.nextLine();
        while ( i < palabra.length()){
            System.out.println("Letra " +(i+1)+ " : " + palabra.substring (i,i+1));
            i++;
        }
    }
}
