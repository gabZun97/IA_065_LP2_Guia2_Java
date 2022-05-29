/*
c. ¿Cuántas veces se ejecuta el cuerpo del siguiente bucle?
i. int i = 0;
ii. while (true) {
iii. i ++;
iv. if (i <10)
v. continue;
vi. i ++;
vii. if (i== 10)
viii. break;
ix. }
 */
package Grupo_Numero_3;

public class E13_EDMR {
    public static void main(String[] args) {
        int i=0;
        while (true) { // Es un ciclo infinito y se ejecutara infinitamente es decir nunca saldra, ya que su condición es verdadera.
            i++;
            if (i<10) {
                continue;
                //i++;
            }
            if (i==10) {
                break;
            }
        }
    }
}
