/*
Construya un programa que genere aleatoriamente un número entre 10 y 1000000. Evalúe si ese
número es mayor que 500000, imprimir el mensaje “El número generado es mayor que 500000”;
por el contrario, si es menor, imprima los números impares comprendidos en el rango de 10 y el
numero generado. Imprima 5 valores por cada fila del mayor al menor (por ejemplo si fuese 100
el número generado serian los impares entre 100 a 10), defina como constante el límite superior e
inferior.
 */
package Grupo_Numero_3;

public class E5_FAMC {
    public static void main(String[] args) {
        final int lmSuperior = 1000000;
        final int lmInferior = 10;
        int numeroAleatorio = 0;
        numeroAleatorio = (int) (Math.random() * (lmSuperior - lmInferior) + lmInferior);
        System.out.println("------------------------------------------------");
        System.out.println(" El Numero aleatorio es: " + numeroAleatorio);
        System.out.println("------------------------------------------------");

        if (numeroAleatorio > 500000) {
            System.out.println(" El numero generado es mayor a 500,000 !! ");
        } else if (numeroAleatorio % 2 != 0) {
            System.out.println("Números impares aleatorios en fila de 5.");
            for (int i = 0; i < 5; i++) {
                numeroAleatorio = (int) (Math.random() * (lmInferior - numeroAleatorio) + numeroAleatorio);
                System.out.println(numeroAleatorio);
            }
        }
    }
}
