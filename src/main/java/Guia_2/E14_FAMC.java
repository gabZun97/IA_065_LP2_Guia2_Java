/*
Un número de palíndromo significa que el número hacia adelante es tan grande como el número
hacia atrás, como 1001,5005, 8228,9999. Imprima todos los palíndromos entre 1000-9999.
 */
package Grupo_Numero_3;

public class E14_FAMC {
    static int Palíndromos (int n) {
        int revision = 0;
        for (int i = n; i > 0; i /= 10) {
            revision = revision * 10 + i % 10;
        }
        return(n == revision) ? 1 : 0;
    }
    static void verificacion (int minimo, int maximo) {
        for (int i = minimo; i <= maximo; i++) {
            if (Palíndromos(i)==1) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main (String args[]) {
        verificacion(1000, 9999);
    }
}
