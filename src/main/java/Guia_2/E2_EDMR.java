/*
b. Intenta predecir qué resultado daría el siguiente código, después puedes escribirlo y ejecutarlo para
comprobar el resultado.
 */
package Grupo_Numero_3;

public class E2_EDMR {
    public static void main(String[] args) {
        int valor=0;
        valor=23;
        valor+=10;// Hasta aquí el valor vale 23+10=33
        System.out.println("Resultado a="+ --valor); // Se le resta 1, valor = 32
        System.out.println("Resultado b="+ ++valor); // Valor era 32+1=33
        System.out.println("Resultado c="+ valor++); // Imprime el valor de 33 y después le aumenta 1 quedando en 34
        System.out.println("Resultado d="+ valor--); // Imprime el 34 y luego le disminuye 1 quedando en  33
        System.out.println("Resultado e="+valor);    // Imprime el valor 33
    }
}
